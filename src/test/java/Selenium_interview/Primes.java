package Selenium_interview;

import java.util.Arrays;
import java.util.List;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> abcd=Arrays.asList(3,6,7,4,43,56,67);
      System.out.println("List of Prime numbers is ");
      for(int n:abcd) {
    	  if(isprime(n)) {
    		  System.out.println(n+ " ");
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
