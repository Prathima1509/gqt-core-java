package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string-2:");
        String str2 = sc.nextLine();
        String str=str1.concat(str2);
        System.out.println(str);
	}

}
