package com.practice;

import java.util.Scanner;

public class EvenOddDigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		while(n>0) {
			int num=n%10;
			if(num % 2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			n=n/10;
		}
		System.out.println("EvenCount: "+evenCount);
		System.out.println("OddCount: "+oddCount);
	}

}
