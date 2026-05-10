package com.practice;

//Java program to print Fibonacci Range.

import java.util.Scanner;

public class FibonacciRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start: ");
		int start=sc.nextInt();
		System.out.println("Enter end: ");
		int end=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		while(n1<=end) {
			n3=n1+n2;
			if(n1>=start) {
				System.out.println(n1);
			}
			n1=n2;
			n2=n3;
		}
		
	}
}
