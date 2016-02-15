package com.nagarosoft.commons.util.validators;

import static org.hamcrest.core.Is.is;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nagarosoft.commons.util.model.TestModel;

public class RucValidatorTest {

	private TestModel model;

	private static ValidatorFactory validatorFactory;
	private static Validator validator;

	@Before
	public void initialize() {
		model = new TestModel();
		
		validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
	}

	@Test
	public void shouldReturnTrueIfRUCisValid() {
		model.setRucTest("1716192792001");

		Set<ConstraintViolation<TestModel>> violations = validator.validate(model);
		
		Assert.assertThat(violations.isEmpty(), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfRUCContainsAtLeastOneLetter() {
		model.setRucTest("17161927920A1");

		Set<ConstraintViolation<TestModel>> violations = validator.validate(model);
		
		Assert.assertThat(violations.isEmpty(), is(false));
	}
	
	@Test
	public void shouldReturnFalseIfRUCSizeIsGreaterThan13() {
		model.setRucTest("171619279200112");

		Set<ConstraintViolation<TestModel>> violations = validator.validate(model);
		
		Assert.assertThat(violations.isEmpty(), is(false));
	}
	
	@Test
	public void shouldReturnFalseIfRUCIsNotValid() {
		model.setRucTest("1716192794001");

		Set<ConstraintViolation<TestModel>> violations = validator.validate(model);
		
		Assert.assertThat(violations.isEmpty(), is(false));
	}

}
