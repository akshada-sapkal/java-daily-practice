package com.practice;

public class PatternNum {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=n;j++) {
				System.out.print(num+" ");
				num=num+4;
			}
			System.out.println();
		}
	}

}
