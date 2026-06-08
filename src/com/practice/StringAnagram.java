package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.next();
		System.out.println("Enter Second String: ");
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("String is Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
