package com.practice;

//Java Program to find the count of even and odd numbers in fibonacci series.
public class EvenOddFibonacciCount {
	public static void main(String[] args) {
		int count=0;
		int n=5;
		int n1=0;
		int n2=1;
		int n3;
		int evenCount=0;
		int oddCount=0;
		while(count<n) {
			n3=n1+n2;
			if(n1 % 2 ==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			n1=n2;
			n2=n3;
			count++;
		}
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);
	}

}
