package org.JUnit.Intro.util;

import org.apache.commons.validator.ValidatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    StringUtil util = new StringUtil();

    @Test
    void nullValue_notOk() {

        assertThrows(ValidatorException.class, () -> {
            util.toUpperCase(null);
        });
      /*  try {
            util.toUpperCase(null);
        } catch (ValidatorException e) {
           return;
        }

       */
   //     fail("ValidationException should be thrown is value is null");
    }
}