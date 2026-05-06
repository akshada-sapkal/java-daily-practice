package com.practice;

import java.util.Scanner;

public class ExtractEvenDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		while(n>0) {
			int num=n%10;
			if(num % 2 ==0) {
				System.out.println("Even Digits: "+num);
			}
			n=n/10;
		}
	}
}
