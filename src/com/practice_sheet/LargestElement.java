package com.practice_sheet;

import java.util.Arrays;

//Find the largest element in Array
//Input: [10, 20, 5, 40, 30]
//Output: 40

//import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
			   max=arr[i];	
			}
		}
		System.out.println(max);
	}
}

