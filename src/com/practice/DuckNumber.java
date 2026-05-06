package com.practice;

import java.util.Scanner;
/* What is a Duck Number?
A Duck Number is a number that:
Contains at least one zero (0)
But does NOT start with zero
👉 Examples:
✅ 1023 → Duck Number (contains 0, doesn’t start with 0)
❌ 0123 → Not a Duck Number (starts with 0)
❌ 123 → Not a Duck Number (no zero)
*/
public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int temp=n;
		boolean isDuck=false;
		while(temp>0) {
			int num=n%10;
			if(num == 0) {
				isDuck=true;
				break;
			}
			n = n/10;
		}
		if(isDuck) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not Duck Number");
		}
	}

}
