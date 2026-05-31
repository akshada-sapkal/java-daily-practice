package com.practice;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		System.out.println("Enter String to find count of vowels and consonants: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLetter(c)) {
			if(c=='a'||c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U') {
				vowelCount++;
			}else {
				consonantCount++;
			}
			}
		}
		System.out.println("Count of Vowels: "+vowelCount);
		System.out.println("Count of Consonants: "+consonantCount);
	}

}
