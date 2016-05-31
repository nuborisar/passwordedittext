package com.example;

import org.junit.Test;

import dalvik.annotation.TestTargetClass;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by nubor on 31/05/2016.
 */
public class PassValidatorTest {


    private PassValidator passValidator;

    @Test
    public void shouldValidate() throws Exception{
        passValidator = new PassValidator("texto1");
        boolean result = passValidator.validate();

        assertTrue(result);
    }

    @Test
    public void shouldNotValidate() throws Exception{
        passValidator = new PassValidator("texto 1");
        boolean result = passValidator.validate();

        assertFalse(result);
    }


}
