package com.practice;

//A Buzz Number is a number that: either ends with 7 OR is divisible by 7

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n % 7==0 || n%10==7) {
			System.out.println("Buzz Number");
		}else {
			System.out.println("No");
		}
	}

}
