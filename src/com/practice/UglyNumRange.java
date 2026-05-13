package com.practice;

import java.util.Scanner;

public class UglyNumRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start: ");
		int s=sc.nextInt();
		System.out.println("Enter End: ");
		int e=sc.nextInt();
		while(s<=e) {
			int n=s;
			while(true) {
				if(n%2==0) {
					n=n/2;
				}else if(n%3==0){
					n=n/3;
				}else if(n%5==0) {
					n=n/5;
				}else {
					break;
				}
			}
			if(n==1) {
				System.out.println(s);
			}
			s++;
		}
	}

}
