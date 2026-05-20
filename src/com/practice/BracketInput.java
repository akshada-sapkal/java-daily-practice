package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BracketInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine().trim();//"[1,2,3,4]"
		line=line.replaceAll("\\[|\\]", "");//remove brackets
		String[] parts=line.split(",");
		int[] arr=new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			arr[i]=Integer.parseInt(parts[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
