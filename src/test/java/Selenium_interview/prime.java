package Selenium_interview;

import java.util.Arrays;
import java.util.List;

public class prime {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,33,2,56,7,63,78,89);
		System.out.println("lit of peime numbers");
		for(int n:numbers) {
			if(isprime(n)) {
				System.out.println(n+ "");
			}
		}
		

	}

	private static boolean isprime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
