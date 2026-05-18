package com.practice;

//Write program for copy elements of one array into another in reverse order.

public class CopyReverseArray {
	public static void main(String[] args) {
		int arr[]= {5,4,1,2};
		int dup[]=new int[arr.length];
		int j=dup.length-1;
		for(int i=0;i<arr.length;i++) {
			dup[j]=arr[i];
			j--;
		}
	}
}
