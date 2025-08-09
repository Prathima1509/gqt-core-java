package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string-2:");
        String str2 = sc.nextLine();
        boolean isSubString=false;
        for(int i=0;i<str1.length()-str2.length();i++) {
        	int j;
        	for( j=0;j<str2.length();j++) {
        		if(str1.charAt(i+j)!=str2.charAt(j)) {
        			break;
        		}
        	}
        	if(j==str2.length()) {
        		isSubString=true;
        		break;
        		
        	}
        }
        if(isSubString) {
        	System.out.println("The string is a substring of another string");
        }
        else {
        	System.out.println("The string is not a substring of another string");
        }
	}

}
