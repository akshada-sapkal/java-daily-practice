package com.practice_sheet;

public class PrintElement {
	 public static void main(String[] args) {
	        String[] arr = {"apple", "orange", "apple", "pineapple"};

	        String maxElement = "";
	        int maxCount = 0;

	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;

	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i].equals(arr[j])) {
	                    count++;
	                }
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                maxElement = arr[i];
	            }
	        }

	        System.out.println(maxElement);
	    }
}
