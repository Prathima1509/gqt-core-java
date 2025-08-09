package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int freq[] = new int[256];
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch!=' ') {
        		freq[ch]++;
        	}
        }
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch!=' '&&freq[ch]==1) {
        		System.out.println("First non repeated character is:"+ch);
        		return;
        	}
        }
        System.out.println("The character found");
	}

}
