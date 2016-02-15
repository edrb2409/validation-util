/**
 * 
 */
package com.nagarosoft.commons.util.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.nagarosoft.commons.util.validators.RUCValidator;

/**
 * @author edrb2409
 *
 */
@Constraint(validatedBy = RUCValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface ValidRUC {
	
	String message() default "Invalid RUC";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
