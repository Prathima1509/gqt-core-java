package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        boolean isDigitOnly=true;
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)<'0'||str.charAt(i)>'9') {
        		isDigitOnly=false;
        		break;
        	}
        }
        if(isDigitOnly&&str.length()>0) {
        	System.out.println("The string contains only digits");
        }
        else {
        	System.out.println("The string not contains only digits");
        }
	}

}
