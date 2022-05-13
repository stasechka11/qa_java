package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CatTest {
    Cat cat;

    @Before
    public void setUp() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void catGetSoundReturnsSoundTest() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catGetFoodReturnsFoodListTest() throws Exception {
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedResult, cat.getFood());
    }
}