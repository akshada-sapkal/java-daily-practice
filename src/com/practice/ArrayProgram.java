package com.practice;

public class ArrayProgram {
	public static void main(String[] args) {
		int[] arr= {12,14,13,16,18,21};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
