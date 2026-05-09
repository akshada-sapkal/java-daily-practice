package com.practice;

//Java program to check whether Lear year is Pallindromic Leap Year or not.

import java.util.Scanner;

public class PallindromicLeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int leapYear=year;
		int rev=0;

		if((year % 400==0) || (year % 4==0 && year%100 !=0)) {
		while(year>0) {
			int num=year%10;
			rev= (rev*10)+num;
			year=year/10;
		}
		if(leapYear == rev) {
			System.out.println("Pallindromic Leap Year");
		}else {
			System.out.println("Not Pallindromic Leap Year");
		}
	}else {
		System.out.println("Not leap year");
	}

	}
}
