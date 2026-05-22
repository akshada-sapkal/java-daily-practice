package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
	public static void main(String[] args) {
		int r=3;
		int c=2;
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();//"1,2,3,4,5,6"
		String[] parts=line.split(",");
		int[][] matrix=new int[r][c];
		int k=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=Integer.parseInt(parts[k].trim());
				k++;
			}
		}
		for(int i=0;i<r;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
