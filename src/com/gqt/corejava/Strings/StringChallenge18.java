package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String res="";
        boolean capitalWord=true;
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch==' ') {
        		res+=ch;
        		capitalWord=true;
        	}
        	else if(capitalWord&& ch>='a'&&ch<='z') {
        		res+=(char)(ch-32);
        		capitalWord=false;
        	}
        	else {
        		res+=ch;
        		capitalWord=false;
        	}
        }
        System.out.println("Capitalized sentence:"+res);
	}

}
