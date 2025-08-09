package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        //  upper case to lower case
        str=str.toLowerCase();
        System.out.println("The conversion to lower case is:"+str);
        System.out.println("--------------------------------------");
        //lower case to upper case
        str=str.toUpperCase();
        System.out.println("The conversion to lower case is:"+str);
	}

}
