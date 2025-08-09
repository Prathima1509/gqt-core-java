package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int count[]=new int[256];
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch!=' ') {
        		count[ch]++;
        	}
        }
        System.out.println("Duplicate characters are:");
        boolean found=false;
        for(int i=0;i<256;i++) {
        	if(count[i]>1) {
        		System.out.println((char)i+"->"+count[i]+"times");
        		found=true;
        	}
        }
        if(!found){
        	System.out.println("No duplicates are found");
        }
	}

}
