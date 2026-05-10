package com.practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int power=0;
		int sum=0;
		while(n>0) {
			n=n/10;
			power++;
		}
		System.out.println("Power: "+power);
		int num2=n;
		while(n>0) {
			int num=n%10;
			int pow= (int)Math.pow(num, power);
			sum=sum+pow;
			n=n/10;
		}
		if(num2==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

}
