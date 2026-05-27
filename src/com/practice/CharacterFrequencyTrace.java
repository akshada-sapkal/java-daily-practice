package com.practice;

public class CharacterFrequencyTrace {
	public static void main(String[] args) {
		String str="programming";
		while(str.length()>0) {
			char ch=str.charAt(0);
			int count=0;
			String temp="";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) {
					count++;
				}else {
					temp=temp+str.charAt(i);
				}
			}
			System.out.println("Frequency of "+ch+" = "+count);
			str=temp;
		}
	}

}
