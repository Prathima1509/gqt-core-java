package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string-2:");
        String str2 = sc.nextLine();
        if(str1.length()==str2.length()&&str1.length()>0) {
        	String temp=str1.concat(str1);
        	if(temp.contains(str2)) {
        		System.out.println("The string is rotation of another string");
        	}
        	else {
        		System.out.println("The string is not rotation of another string");
        	}
        	
        }
        else {
        	System.out.println("The string is not rotation of another string");
        }
        
	}

}
