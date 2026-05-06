package com.practice;

import java.util.Scanner;

public class OccurrenceOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		
		System.out.println("Enter Digit: ");
		int digit=sc.nextInt();
		int count=0;
		while(n>0) {
			int num=n%10;
			if(num==digit) {
				count++;
			}
			n=n/10;
		}
		System.out.println("Digit Occurred "+count+" times");
		
	}

}
