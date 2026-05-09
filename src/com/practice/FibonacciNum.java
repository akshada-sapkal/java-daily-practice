package com.practice;

import java.util.Scanner;

//Java Program to check whether Number is fibonacci or not.
public class FibonacciNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int count=0;
		int n1=0;
		int n2=1;
		int n3;
		if(num ==0 || num == 1) {
			System.out.println("Fibonacci");
			return;
		}
		while(count<num) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(num==n3) {
				System.out.println("Fibonacci");
				return;
			}
			count++;
		}
		System.out.println("Not Fibonacci Number");
	}

}
