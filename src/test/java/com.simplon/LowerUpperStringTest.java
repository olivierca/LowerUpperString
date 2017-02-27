package com.simplon;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowerUpperStringTest {

    @Test
    public void TestOK()
    {
        // set
        LowerUpperString alternate = new LowerUpperString();
        // test
        String result = alternate.toAlternativeString("altERnaTIng cAsE");
        // assert
        assertEquals("ALTerNAtiNG CaSe",result);
    }

    @Test
    public void TestKO()
    {
        // set
        LowerUpperString alternate = new LowerUpperString();
        // test
        String result = alternate.toAlternativeString("altERnaTIng CAsE");
        // assert
        assertEquals("ALTerNAtiNG CaSe",result);
    }

    @Test
    public void TestNULL()
    {
        // set
        LowerUpperString alternate = new LowerUpperString();
        // test
        String result = alternate.toAlternativeString("");
        // assert
        assertEquals("ALTerNAtiNG CaSe",result);
    }

}
