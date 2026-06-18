package com.practice;

import java.util.Arrays;

//Remove duplicates from an array. 
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr= {2,3,4,2,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[j] != arr[i]) {
				j++;
				arr[j]=arr[i];
			}
		}
		System.out.println("After removing duplicates from Array: ");
		for(int i=0;i<=j;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
