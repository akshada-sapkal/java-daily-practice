package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringSpaceSeparateWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String[] words=line.split(" ");
		System.out.println(Arrays.toString(words));
	}

}
