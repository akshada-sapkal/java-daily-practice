package com.practice;

//Perfect Number: Sum of proper factors=Number itself

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n % i==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of factors is: "+sum);
		if(n==sum) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
		}
	}

}
