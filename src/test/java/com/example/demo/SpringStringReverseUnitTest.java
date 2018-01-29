package com.example.demo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpringStringReverseUnitTest {

    private SpringStringReverseService service;

    @Before
    public void init() {
        service = new SpringStringReverseService();
    }

    @Test
    public void reverseStringTest_null() {
        // set
        String original = null;
        //act
        String result = service.reverseString(original);
        // check
        assertEquals(null, result);
    }

    @Test
    public void reverseStringTest_empty() {
        // set
        String original = "";
        //act
        String result = service.reverseString(original);
        // check
        assertEquals("", result);
    }

    @Test
    public void reverseStringTest_some() {
        // set
        String original = "123456789";
        //act
        String result = service.reverseString(original);
        // check
        assertEquals("987654321", result);
    }

}
