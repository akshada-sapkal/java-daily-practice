package com.practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers and a target value, return the indices of the two numbers whose sum equals the target.
//
//Example:
//
//Input:
//arr = [2,7,11,15]
//target = 9
//
//Output:
//[0,1]

public class TwoSum {
	public static int[] twoSum(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {};
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
		System.out.println("Enter the target: ");
		int target=sc.nextInt();
		System.out.println(Arrays.toString(twoSum(arr,target)));
		
	}

}
