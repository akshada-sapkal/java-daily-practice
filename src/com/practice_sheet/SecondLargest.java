package com.practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

//Find the largest element in Array
//Input: [10, 20, 5, 40, 30]
//Output: 30

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements in Array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int largest=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
		}
		System.out.println("Second Largest Element in given Array: "+secondLargest);
	}

}
