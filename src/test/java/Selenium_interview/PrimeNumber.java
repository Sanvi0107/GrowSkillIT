package Selenium_interview;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
	
	public static  boolean isprime(int n) {
		if(n<=1)
		return false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,7,5,2,34,65,76,67);
		
		System.out.println("List of prime numbers");
		for(int n:numbers) {
			if(isprime(n)) {
				System.out.println(n+ " ");
			}
		}
	}

	

}
