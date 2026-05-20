package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringFormatArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();//reads entire line
		String[] parts=line.split("");//split by space
		int[] arr=new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			arr[i]=Integer.parseInt(parts[i]);//covert into int
		}
		System.out.println(Arrays.toString(arr));
	}

}
