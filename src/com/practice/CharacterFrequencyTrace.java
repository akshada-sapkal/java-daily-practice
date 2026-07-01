package com.practice;

import java.util.Scanner;

public class CharacterFrequencyTrace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to count character frequency: ");
		String str=sc.next();
		while(str.length()>0) {
			char ch=str.charAt(0);
			String temp="";
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) {
					count++;
				}else {
					temp=temp+str.charAt(i);
				}
			}
			System.out.println(ch+" "+count);
			str=temp;
			
		}
		
		
		
	}

}
