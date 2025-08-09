package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string-2:");
        String str2 = sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        boolean[] printed = new boolean[256];
        System.out.println("Common characters:");
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1 && !printed[ch]) {
                System.out.print(ch + " ");
                printed[ch] = true;
            }
        }
        
	}

}
