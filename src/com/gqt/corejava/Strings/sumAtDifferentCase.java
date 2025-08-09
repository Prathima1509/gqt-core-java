package com.gqt.corejava.Strings;

import java.util.Scanner;

public class sumAtDifferentCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int smallercase_sum=0;
		int capitalcase_sum=0;
		int cons_product=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
					capitalcase_sum+=str.charAt(i);
					//capitalcase_sum+=i; //index sum
				}
			}
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					smallercase_sum+=str.charAt(i);
					//smallercase_sum+=i; //index sum
				}
			}
			cons_product*=str.charAt(i);
			//cons_product*=i; //index product
		}
		System.out.println("The capitalcase sum is:"+capitalcase_sum);
		System.out.println("The smallercase sum is:"+smallercase_sum);
		System.out.println("The consonants product is:"+cons_product);
	}

}
