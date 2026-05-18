package com.practice;

public class CountOfElement {
	public static void main(String[] args) {
		int[] arr= {2,3,2,5,6,7,8};
		int count=0;
		int ele=2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				count++;
			}
		}
		System.out.println(count);
	}

}
