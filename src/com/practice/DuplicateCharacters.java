package com.practice;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String s="Hello";
		String s1="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					s1=s1+s.charAt(i);
				}
			}
		}
		System.out.println(s1);
	}

}
