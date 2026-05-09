package com.practice;

//Java program to find reverse of number.
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			 int num=n % 10;
			 rev=(rev*10)+num;
			 n=n/10;
		}
		System.out.println("Reverse of Number is: "+rev);
	}
}
