package com.softserve.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
    private static final double DELTA = 0.001;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    // @Test
    public void testAdd() {
        System.out.println("\t\t@Test testAdd()");
        // int i = 0;
        double i = 0;
        System.out.println("\t\t\tresult = " + (10 / i));
        if (i == 0) {
            throw new RuntimeException("Ha-Ha-Ha");
        }
        // fail("Not yet implemented");
    }

    @Test
    public void testAdd1() {
        System.out.println("\t\t@Test testAdd1()");
        Calc calc = new Calc();
        double expected = 8;
        double actual;
        //
        actual = calc.add(4, 4);
        Assert.assertEquals("Check 4+4", expected, actual, DELTA);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");
        Calc calc = new Calc();
        double expected = 9;
        double actual;
        //
        actual = calc.add(5, 4);
        Assert.assertEquals("Check 5+4", expected, actual, DELTA);
    }

    @Test
    public void testDiv1() {
        System.out.println("\t\t@Test testDiv1()");
        Calc calc = new Calc();
        double expected = 5;
        double actual;
        //
        actual = calc.div(20, 4);
        Assert.assertEquals("Check 20/4", expected, actual, DELTA);
    }

    @Test
    public void testDiv2() {
        System.out.println("\t\t@Test testDiv2()");
        Calc calc = new Calc();
        double expected = 2.5;
        double actual;
        //
        actual = calc.div(20, 8);
        Assert.assertEquals("Check 20/8", expected, actual, DELTA);
    }
}
