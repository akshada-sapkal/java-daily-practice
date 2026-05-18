package com.practice;

public class MergeArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int[] ar= {50,60,70};
		int[] c=new int[arr.length+ar.length];
		int mem=0;
		for(int i=0;i<arr.length;i++) {
			c[mem]=arr[i];
		}
		for(int j=0;j<ar.length;j++) {
			c[mem]=ar[j];
		}
		
	}
}
