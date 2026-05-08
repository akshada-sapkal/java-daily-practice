package com.practice;

public class Power {
	public static void main(String[] args) {
	   int base=2;
	   int power=1;
	   int raise=5;
	   for(int times=0;times<raise;times++) {
		   power=power * base;
	   }
	   System.out.println(power);
	}
}
