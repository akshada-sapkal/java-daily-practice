package com.practice;

//Example input:12.34567
//output:12.346

import java.util.Scanner;
public class FloatingPoint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		System.out.printf("%.3f",num);
	}

}
