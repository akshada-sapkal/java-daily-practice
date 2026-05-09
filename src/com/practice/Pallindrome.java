package com.practice;

//Java program to check whether number is pallindrome or not.
import java.util.Scanner;
public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int number=n;
		int rev=0;
		while(n>0) {
			int num=n % 10;
			rev=(rev * 10)+num;
			n=n/10;
		}
		if(number == rev) {
			System.out.println("Pallindrome Number");
		}else {
			System.out.println("Not Pallindrome Number");
		}
	}

}
