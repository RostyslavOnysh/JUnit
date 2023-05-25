package org.JUnit.Intro.service;

public class GmailValidator implements EmailValidator{
    @Override
    public boolean isValid(String email) {
        return false;
    }
}
