package com.practice;

import java.util.Scanner;

public class EvenSumOddProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		while(n>0) {
			int num=n%10;
			if(num % 2==0) {
				sum=sum+num;
			}else {
				product=product*num;
			}
			n=n/10;
		}
		System.out.println("Sum of Even digits: "+sum);
		System.out.println("Product of Odd digits: "+product);
	}

}
