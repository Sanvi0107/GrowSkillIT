package day5_14042025;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups= {"Smoke"})
	public void test1() {
		System.out.println("Test case 1 {\"Smoke\"}");
	}
	
	@Test(groups= {"Sanity"})
	public void test2() {
		System.out.println("Test case 2 {\"Sanity\"})");
	}
	
	@Test(groups= {"Smoke & sanity"})
	public void test3() {
		System.out.println("Test case 3 {\"Smoke & sanity\"}");
	}
	
	@Test(groups= {"Smoke and regression"})
	public void test4() {
		System.out.println("Test case 4");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void test5() {
		System.out.println("Test case 5");
	}
	
	@Test(groups= {"Smoke","Sanity","Regression"})
	public void test6() {
		System.out.println("Test case 6");
	}
	
	@Test(groups= {"Regression"})
	public void test7() {
		System.out.println("Test case 7");
	}
	
	@Test(groups= {"Smoke","Sanity","Regression"})
	public void test8() {
		System.out.println("Test case 8");
	}
	
	@Test(groups= {"Retest"})
	public void test9() {
		System.out.println("Test case 9");
	}

}
