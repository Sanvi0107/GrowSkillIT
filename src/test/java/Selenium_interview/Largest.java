package Selenium_interview;

import java.util.Arrays;
import java.util.List;

public class Largest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> numbers=Arrays.asList(45,34,2,67,89,45,678);
     int smallest=numbers.get(0);
     for(int n:numbers) {
    	 if(n<smallest) {
    		 smallest=n;
    	 }
    	 
     }
     System.out.println("largest number is " +smallest);
	}

}
