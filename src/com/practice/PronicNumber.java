package com.practice;

import java.util.Scanner;

//A Pronic Number is a number that is the product of two consecutive numbers.
//Formula: n×(n+1)

public class PronicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(i*(i+1)==n) {
				count++;
				break;
			}
		}
		if(count>0) {
			System.out.println("Pronic Number");
		}else {
			System.out.println("Not Pronic Number");
		}
	}
}
