package com.practice;

import java.util.Scanner;

//Neon Number: A number is a Neon number when sum of digits of square
//of number is equal to original number
//ex. 9^2=81=8+1=9
public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n*n;
		System.out.println(num);
		int sum=0;
		while(num>0) {
			int num2=num%10;
			sum=sum+num2;
			num=num/10;
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not Neon Number");
		}
	}
}
