package com.practice;

import java.util.Scanner;

public class ExtractDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		while(n>0) {
			int num=n%10;
			System.out.println("Digits in Number: "+num);
			n=n/10;
		}
	}

}
