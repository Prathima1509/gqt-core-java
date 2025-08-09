package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        str=str.toLowerCase();
        int count[]=new int[256];
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	count[ch]++;
        	if(count[ch]==2) {
        		System.out.println("The first repeating character is:"+ch);
        		return;
        	}
        }
        System.out.println("The first repeating character not found");
	}

}
