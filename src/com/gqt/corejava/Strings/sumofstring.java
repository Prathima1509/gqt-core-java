package com.gqt.corejava.Strings;

import java.util.Scanner;

public class sumofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum=sum+str.charAt(i);
//			sum=sum+i;//indexes sum
		}
		System.out.println("The sum of entire string is:"+sum);
	}

}
