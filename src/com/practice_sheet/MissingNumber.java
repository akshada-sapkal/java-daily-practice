package com.practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

//Find Missing Number
//
//Problem:
//Given an array containing numbers from 1 to N with one number missing, find the missing number.
//
//Example
//
//Input:
//1 2 4 5
//
//Output:
//3

public class MissingNumber {
	public static int findNum(int arr[]) {
		int N=arr.length+1;
		int expectedSum=(N*(N+1))/2;
		int actualSum=0;
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		int res=expectedSum-actualSum;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(findNum(arr));
		
	}

}
