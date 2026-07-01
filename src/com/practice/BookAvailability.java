package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/*Problem Statement – Find Book Availability

A library stores details of books using Book ID and Book Title.

Write a program to check whether a given Book ID is available in the library.

If the entered Book ID exists, display the corresponding Book Title. Otherwise, display "Not Available".

Input Format
First line contains an integer N representing the number of books.
Next N lines contain:
an integer Book ID
a string Book Title
Last line contains an integer searchId representing the Book ID to search.
Output Format
Print the Book Title if the book is found.
Otherwise print:
Not Available
Constraints
1 ≤ N ≤ 100
1 ≤ Book ID ≤ 10000
Sample Input 1
3
1 abc
2 xyz
3 pqr
2
Sample Output 1
xyz
Explanation

Book ID 2 exists in the library and its title is xyz.

Sample Input 2
3
1 abc
2 xyz
3 pqr
5
Sample Output 2
Not Available
Explanation

Book ID 5 does not exist in the library.*/

public class BookAvailability {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Books: ");
		int n=sc.nextInt();
		int[] id=new int[n];
		String[] title=new String[n];
		for(int i=0;i<n;i++) {
			id[i]=sc.nextInt();
			title[i]=sc.next();
		}
		System.out.println("Enter the id of book that to be search: ");
		int searchId=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(searchId==id[i]) {
				System.out.println(title[i]);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Not Available");
		}
		
	}

}
