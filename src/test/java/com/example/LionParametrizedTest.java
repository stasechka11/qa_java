package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    Lion lion;
    boolean expected;

    public LionParametrizedTest(Lion lion, boolean expected){
        this.lion = lion;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getHasManeData() throws Exception {
        return new Object[][] {
                { new Lion("Самка", new Feline()), false},
                { new Lion("Самец", new Feline()), true}
        };
    }

    @Test
    public void doesHaveManeTest() {
       Assert.assertEquals(lion.doesHaveMane(), expected);
    }

}