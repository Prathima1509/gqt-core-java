package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        str=str+" ";
        String longestword="";
        String currentword="";
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch!=' ') {
        	currentword+=ch;
        	}
        	else {
        		if(currentword.length()>longestword.length()) {
        			longestword=currentword;
        		}
        		currentword="";
        	}
        }
        System.out.println("The longest word is: " + longestword);
        System.out.println("Length of longest word: " + longestword.length());

	}

}
