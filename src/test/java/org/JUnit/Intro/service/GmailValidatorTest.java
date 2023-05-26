package org.JUnit.Intro.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GmailValidatorTest {
    private EmailValidator emailValidator = new GmailValidator();

    @Test
    void containsGmailDomen_Ok() {
        String email = "valid@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertTrue(actual);
    }

    @Test
    void startWithNumber_notOk() {
        String email = "456valid@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertFalse(actual);
    }

    @Test
    void startWithSymbol_notOk() {
        String email = "#$valid@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertFalse(actual);
    }

    @Test
    void containsSymbolsAndLetter_Ok() {
        String email = "vali#$34d@gmail.com";
        boolean actual = emailValidator.isValid(email);
        assertTrue(actual);
    }

    @Test
    void nullValue_notOk() {
       assertThrows(NullPointerException.class, () -> {
           emailValidator.isValid(null);
       });
    }
}