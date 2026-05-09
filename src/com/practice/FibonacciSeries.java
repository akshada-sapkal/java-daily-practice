package com.practice;

//Java program to find fibonacci series.
public class FibonacciSeries {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		int n1=0;
		int n2=1;
		int n3;
		while(count<n) {
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
			count++;
		}
	}

}
