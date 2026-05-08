package com.practice;

public class Factor {
	public static void main(String[] args) {
		int num=234;
		for(int den=1;den<=num;den++) {
			if(num % den ==0) {
				System.out.println(den);
			}
		}
	}
}
