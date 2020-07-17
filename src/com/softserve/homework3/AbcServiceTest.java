package com.softserve.homework3;

import org.junit.Assert;
import org.junit.Test;

public class AbcServiceTest {

    @Test
    public void checkSort() {
        AbcService abcService = new AbcService();
        Abc origin = new Abc(4, 8, 1);
        Abc expected = new Abc(1, 4, 8);
        Abc actual = abcService.sort(origin);
        Assert.assertEquals(expected, actual);
    }
}
