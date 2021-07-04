package com.course.selenium;

import org.junit.*;

public class JunitExampleTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("this will be done before running tests in this class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("this will be done AFTER running tests in this class");
    }

    @Before
    public void beforeEach() {
        System.out.println("this will be done before each test");
    }

    @After
    public void afterEach() {
        System.out.println("this will be done AFTER each test");
    }

    @Test
    public void shouldRun() {
        System.out.println("shouldRun run");
    }

//    @Ignore
    @Test
    public void shouldRunAnotherTest() {
        System.out.println("shouldRunAnotherTest run");
    }
}
