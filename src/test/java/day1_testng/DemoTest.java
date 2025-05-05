package day1_testng;

import org.testng.annotations.*;

public class DemoTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void testOne() {
        System.out.println("Test One");
    }

    @Test
    public void testTwo() {
        System.out.println("Test Two");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
