package com.practice;

import java.util.Scanner;

public class maxSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		boolean[] removed=new boolean[n+1];
		for(int i=n;i>=1;i--) {
			if(!removed[i]) {
				sum=sum+i;
				int left=(i==1)?n:i-1;
				int right=(i==n)?1:i+1;
				removed[left]=true;
				removed[right]=true;
			}
		}
		System.out.println(sum*m);
	}

}
