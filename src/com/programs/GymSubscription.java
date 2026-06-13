package com.programs;

import java.util.Scanner;

/*
A gym offers memberships:   
Duration (months) | Cost (₹)  |
------------------|-----------|
3                 |  5000     |
6                 |  7000     |
9                 |  12000    |
12                |  15000    |
  
Given an input number of months, return the total cost.  
If the input cannot be formed using these plans → print "Error". 
Input:  month-15
Output: Cost-25000
 */

public class GymSubscription {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m%12==0) {
			System.out.println("Cost: "+((m/12)*15000));
		}else if(m % 9==0) {
			System.out.println("Cost: "+((m/9)*12000));
		}else if(m % 6==0) {
			System.out.println("Cost: "+((m/6)*7000));
		}else if(m % 3==0) {
			System.out.println("Cost: "+((m/3)*5000));
		}else {
			System.out.println("Error");
		}
	}
	

}
