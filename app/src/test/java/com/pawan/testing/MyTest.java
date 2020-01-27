package com.pawan.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {
    @Test
    public void testAddition()
    {
        Arthmetic arthmetic=new Arthmetic();
        float expectedResult=10;
        float actualResult=arthmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction()
    {
        Arthmetic arthmetic=new Arthmetic();
        float expectedResult=-2;
        float actualResult=arthmetic.subtract(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivision()
    {
        Arthmetic arthmetic=new Arthmetic();
        float expectedResult=5;
        float actualResult=arthmetic.divide(10,2);
        assertEquals(expectedResult,actualResult);
    }
}
