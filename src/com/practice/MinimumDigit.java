package com.practice;

import java.util.Scanner;

public class MinimumDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int min=9;
		while(n>0) {
			int num=n%10;
			if(num<min) {
				min=num;
			}
			n=n/10;
		}
		System.out.println("Minimum Digit: "+min);
	}

}
