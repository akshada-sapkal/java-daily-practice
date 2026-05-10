package com.practice;

import java.util.Scanner;

//Java program for print the sum of factorials of digit in number.
//Check number is Strong or not
//A number is strong number when the sum of factorials of digit is equal to actual number
//ex. 145=5!+4!+1!
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=n;
		int sum=0;
		while(n>0) {
			int num=n%10;
			int product=1;
			while(num>0) {
				product=product*num;
				num--;
			}
			sum=sum+product;
			n=n/10;
		}
		if(number==sum) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not Strong Number");
		}
	}

}
