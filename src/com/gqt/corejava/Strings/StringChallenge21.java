package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++) {
        	char currentchar=str.charAt(i);
        	boolean isDuplicate=false;
        	for(int j=0;j<res.length();j++) {
        		if(currentchar==res.charAt(j)) {
        		 isDuplicate=true;
        			break;
        		}
        	}
        	if(!isDuplicate) {
        		res+=currentchar;
        	}
        }
        System.out.println("The string after removing duplicates:"+res);
	}

}
