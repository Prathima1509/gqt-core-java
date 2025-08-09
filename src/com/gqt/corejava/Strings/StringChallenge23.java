package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1:");
        String str1 = sc.nextLine();
        str1=str1.toLowerCase();
        boolean isPanagram=true;
        for(char ch='a';ch<='z';ch++) {
        	if(str1.indexOf(ch)==-1) {
        		isPanagram=false;
        		break;
        	}
        }
        if(isPanagram) {
        	System.out.println("The string is Panagram");
        }
        else {
        	System.out.println("The string not a is Panagram");
        }
	}

}
