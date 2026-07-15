package com.practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

public class PrintElement {
	 public static void main(String[] args) {
//	        String[] s= {"apple","orange","apple","banana"};
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String[] s=new String[n];
	        for(int i=0;i<n;i++) {
	        	s[i]=sc.next();
	        }
	        System.out.println(Arrays.toString(s));
	        String maxElement="";
	        int maxCount=0;
	        for(int i=0;i<s.length;i++) {
	        	int count=0;
	        	for(int j=0;j<s.length;j++) {
	        		if(s[i].equals(s[j])) {
	        			count++;
	        		}
	        	}
	        	if(count>maxCount) {
	        		maxCount=count;
	        		maxElement=s[i];
	        	}
	        }
	        System.out.println(maxElement);
	    }
}
