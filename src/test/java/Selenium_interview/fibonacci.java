package Selenium_interview;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int array=sc.nextInt();
		
		int first=0;
		int second=1;
		System.out.println("fibonacci number");
		for(int i=1;i<=array;i++) {
			System.out.print(first + " ");
			int next=first+second;
			first=second;
			second=next;
		}
        
	}

}
