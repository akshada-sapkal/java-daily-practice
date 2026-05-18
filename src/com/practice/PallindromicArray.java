package com.practice;
//Check given array is pallindromic or not.
public class PallindromicArray {
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,6,4,2};
		boolean isPalindrome=true;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
