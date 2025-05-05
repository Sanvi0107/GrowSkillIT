package Selenium_interview;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String array=sc.nextLine();
		String reverse="";
		for(int i=array.length()-1;i>=0;i--) {
			reverse=reverse+array.charAt(i);
		}
    System.out.println("Reverse of String is " +reverse);
	}

}
