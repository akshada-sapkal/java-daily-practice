package com.practice;

import java.util.Scanner;

public class EvenOddFactorCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int evenFactorCount=0;
		int oddFactorCount=0;
		for(int den=1;den<=n;den++) {
			if(n % den ==0) {
				if(den % 2==0) {
					evenFactorCount++;
				}else {
					oddFactorCount++;
				}
			}
		}
		System.out.println("Even Factors: "+evenFactorCount);
		System.out.println("Odd Factors: "+oddFactorCount);
	}

}
