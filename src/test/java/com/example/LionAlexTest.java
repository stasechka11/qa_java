package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {
    Feline feline;
    LionAlex lionAlex;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void lionAlexGetFriendsReturnsListOfFriends() {
        List<String> expectedResult = Arrays.asList("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        Assert.assertEquals(expectedResult, lionAlex.getFriends());
    }

    @Test
    public void lionAlexGetPlaceOfLivingReturnsText() {
        String expectedResult = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expectedResult,lionAlex.getPlaceOfLiving());
    }

    @Test
    public void lionAlexGetKittensReturns0() {
        assertEquals(0, lionAlex.getKittens());
    }
}