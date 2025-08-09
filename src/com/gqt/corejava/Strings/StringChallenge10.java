package com.gqt.corejava.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringChallenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string-2:");
        String str2 = sc.nextLine();
        str1=str1.replaceAll(" ", "").toLowerCase();
        str2=str2.replaceAll(" ", "").toLowerCase();
        if(str1.length()!=str2.length()) {
        	System.out.println("The two strings are not anagrams due to different length");
        }
        else {
        	char arr1[]=str1.toCharArray();
        	char arr2[]=str2.toCharArray();
        	Arrays.sort(arr1);
        	Arrays.sort(arr2);
        	if(Arrays.equals(arr1, arr2)) {
        		System.out.println("The two strings are  anagrams");
        	}
        	else {
        		System.out.println("The two strings are not anagrams" );
        	}
        }
	}

}
