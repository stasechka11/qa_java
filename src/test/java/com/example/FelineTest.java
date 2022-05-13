package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {
    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void felineEatMeatReturnListOfFoodTest() throws Exception {
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedResult, feline.eatMeat());
    }

    @Test
    public void felineGetFamilyReturnFamilyNameTest() {
        String expectedResult = "Кошачьи";
        Assert.assertEquals(expectedResult, feline.getFamily());
    }

    @Test
    public void felineGetKittensReturns1Test() {
        Assert.assertEquals(1,feline.getKittens());
    }

}