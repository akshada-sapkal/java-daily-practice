package com.practice;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr= {5,6,7,8};
		int[] dup=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			dup[i]=arr[i];
		}
	}

}
