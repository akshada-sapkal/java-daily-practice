package com.practice_sheet;

import java.util.Arrays;

//Find the duplicate elements in array
// Input: {1, 2, 3, 2, 4, 1}
// Output: 1,2

//import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}		
	}
}


