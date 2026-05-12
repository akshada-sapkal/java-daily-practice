package com.practice;

//An Ugly Number is a number whose prime factors are only 2, 3, and 5.
//Examples:
//6 → Ugly Number (2 × 3)
//8 → Ugly Number (2 × 2 × 2)
//14 → Not Ugly Number (contains factor 7)

import java.util.Scanner;

public class UglyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n%2==0) {
			n=n/2;
		}
		while(n%3==0) {
			n=n/3;
		}
		while(n%5==0) {
			n=n/5;
		}
		if(n==1) {
			System.out.println("Ugly Number");
		}else {
			System.out.println("Not Ugly Number");
		}
	}
}
