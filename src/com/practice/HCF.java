package com.practice;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b=sc.nextInt();
		int min=(a<b)?a:b;
		while(true) {
			if(a%min==0 && b%min==0) {
				System.out.println("HCF: "+min);
				break;
			}
			min--;
		}
	}

}
