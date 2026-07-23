package com.practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

public class WordFrequency {
	public static void main(String[] args) {
		String s="I Love Satara I Love Java";
		String[] word=s.split(" ");
		System.out.println(Arrays.toString(word));
		for(int i=0;i<word.length;i++) {
			int count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="";
				}
			}
			if(word[i].length()>0) {
				System.out.println(word[i]+" "+count);
			}
		}
	}
}


