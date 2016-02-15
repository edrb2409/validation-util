package com.nagarosoft.commons.util.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.nagarosoft.commons.util.annotations.ValidRUC;

public class RUCValidator implements ConstraintValidator<ValidRUC, String>{

	@Override
	public void initialize(ValidRUC rucAnnotation) { }

	@Override
	public boolean isValid(String ruc, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
