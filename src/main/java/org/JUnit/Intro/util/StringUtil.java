package org.JUnit.Intro.util;

import org.apache.commons.validator.ValidatorException;

public class StringUtil {
    public String toUpperCase(String string) throws ValidatorException {
        if (string == null) {
            throw new ValidatorException("String cannot be null !");
        }
        return string.toUpperCase();
    }
}
