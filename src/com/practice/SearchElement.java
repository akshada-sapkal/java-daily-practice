package com.practice;

public class SearchElement {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		int target=5;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(target+" is present in array");
			}
		}
	}

}
