package com.practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int originalNum=n;
		int pow=0;
		int sum=0;
		while(n>0) {
			n=n/10;
			pow++;
		}
		System.out.println("Power of given number is :"+pow);
		n=originalNum;
		while(n>0) {
			int rem=n % 10;
			int power=(int) Math.pow(rem, pow);
			sum=sum+power;
			n=n/10;
		}
		if(originalNum==sum) {
			System.out.println(originalNum+" is the Armstrong Number");
		}else {
			System.out.println(originalNum+" is not Armstrong Number");
		}
	}

}
