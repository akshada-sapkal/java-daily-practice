package com.practice_sheet;

public class WordFrequency {
	public static void main(String[] args) {
		String s="I Love Satara I Love Java";
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			int count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="";
				}
			}
			if(words[i].length()>0) {
				System.out.println(words[i]+" = "+count);
			}
		}
	}
}
