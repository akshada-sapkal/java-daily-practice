package com.practice;

import java.util.Scanner;

//A number is called a Twisted Prime Number if:
//The number itself is prime
//Its reverse is also prime

public class TwistedPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int count1=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count1++;
			}
		}
		int rev=0;
		int copy=temp;
		while(copy>0) {
			int digit=copy%10;
			rev=rev*10+digit;
			copy=copy/10;
		}
		int count2=0;
		for(int i=1;i<=rev;i++) {
			if(rev%i==0) {
				count2++;
			}
		}
		if(count1==2 && count2==2) {
			System.out.println("Twisted Prime Number");
		}else {
			System.out.println("Not Twisted Prime Number");
		}
	}

}
