package com.practice;

import java.util.Scanner;

public class MaximumDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int max=0;
		while(num>0) {
			int n=num%10;
			if(n>max) {
				max=n;
			}
			num=num/10;
		}
		System.out.println("Maximum Digit: "+max);
	}
}
