package com.practice;

//Java program to the count of numbers in Fibonacci Range.

import java.util.Scanner;

public class CountFibonacciNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int count=1;
		int n1=0;
		int n2=1;
		int n3;
		while(count<=num) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count++;
		}
		System.out.println(count);
	}

}
