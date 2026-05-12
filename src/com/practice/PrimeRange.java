package com.practice;

import java.util.Scanner;
public class PrimeRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		while(s<=e) {
			int den=2;
			
			while(den<s) {
				if(s%den==0) {
					break;
				}
				den++;
			}
			
				if(den==s || s==2) {
					System.out.println(s);
				}
				s++;
			}
		}
		
	}

