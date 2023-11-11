package java.com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String domain;

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
        domain = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s != null) {
            return s.endsWith(domain);
        }
        return false;
    }
}
