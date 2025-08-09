package com.gqt.corejava.Strings;

public class StringCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAMA";
		String s2="RAMA";
		String s3="rama";
		String s4="SITA";
		System.out.println("case-1:Same Strings");
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----------------------");
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("===================");
		System.out.println("case-2:Different Strings");
		if(s1.equalsIgnoreCase(s4)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----------------------");
		if(s1==s4) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("===================");
		System.out.println("case-3:Same Strings with Different cases");
		if(s1.equalsIgnoreCase(s3)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----------------------");
		if(s1==s3) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("===================");
	}

}
