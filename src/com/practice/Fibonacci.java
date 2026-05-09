package com.practice;

//Java program to find nth fibonacci number.
public class Fibonacci {
	public static void main(String[] args) {
		int count=0;
		int n=4;
		int n1=0;
		int n2=1;
		int n3;
		while(count<n) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count++;
		}
		System.out.println(n1);
	}

}
