package com.gqt.corejava.Strings;

import java.util.Scanner;

public class VowelAndConsonantCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int smallervowel_count=0;
		int capitalvowel_count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
					capitalvowel_count++;
				}
			}
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					smallervowel_count++;
				}
			}
		}
		System.out.println("The capitalvowels count is:"+capitalvowel_count);
		System.out.println("The smallervowels_count count is:"+smallervowel_count);
	}

}
