package com.practice;

//A Harshad number (also called a Niven number) is a number that is divisible by the sum of its digits.
//18 : Sum of digits = 1+8=9
//18÷9=2 ✔ → Harshad number

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int num=n%10;
			sum=sum+num;
			n=n/10;
		}
		if(temp%sum==0) {
			System.out.println(temp+" is Harshad Number");
		}else {
			System.out.println(temp+"is not Harshad Number");
		}
	}

}
