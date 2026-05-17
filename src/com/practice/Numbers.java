package com.practice;

public class Numbers {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((a++)+"  ");
			}
			System.out.println();
		}
	}

}
