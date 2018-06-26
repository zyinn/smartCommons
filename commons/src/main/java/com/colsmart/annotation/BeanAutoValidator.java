package com.colsmart.annotation;



import org.apache.commons.lang3.StringUtils;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BeanAutoValidator.AutoValidator.class)
@Inherited
@Documented
public @interface BeanAutoValidator {

    String massage() default "{massage}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class AutoValidator implements ConstraintValidator<BeanAutoValidator, String> {

        @Override
        public void initialize(BeanAutoValidator beanAutoValidator) {

        }

        @Override
        public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
            if(StringUtils.isBlank(s))return false;

            return false;
        }
    }
}
