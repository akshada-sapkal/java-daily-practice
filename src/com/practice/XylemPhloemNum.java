package com.practice;

import java.util.Scanner;

public class XylemPhloemNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int endsum=n%10;
		n=n/10;
		int meansum=0;
		while(n>9) {
			meansum=meansum+(n%10);
			n=n/10;
		}
		endsum=endsum+n;
		if(endsum==meansum) {
			System.out.println("Xylem");
		}else {
			System.out.println("Pholem");
		}
	}

}
