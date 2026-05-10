package com.practice;

import java.util.Scanner;

//Spy Number : Sum of digits=Product of digits

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int num1=n;
		int sum=0;
		while(n>0) {
			int num=n%10;
			sum=sum+num;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
		int prod=1;
		while(num1>0) {
			int num2=num1%10;
			prod=prod*num2;
			num1=num1/10;
		}
		System.out.println("Product of digits: "+prod);
		if(sum==prod) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not Spy Number");
		}
	}

}
