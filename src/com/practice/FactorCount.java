package com.practice;

import java.util.Scanner;

public class FactorCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int count=0;
		for(int den=1;den<=n;den++) {
			if(n % den ==0) {
				count++;
			}
		}
		System.out.println("Count of Factors: "+count);
	}

}
