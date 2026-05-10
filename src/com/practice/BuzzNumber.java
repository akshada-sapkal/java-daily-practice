package com.practice;

//A Buzz Number is a number that: either ends with 7 OR is divisible by 7

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		if(n % 10==7 || n%7 ==0) {
			System.out.println("Buzz Number");
		}else {
			System.out.println("Not Buzz Number");
		}
	}

}
