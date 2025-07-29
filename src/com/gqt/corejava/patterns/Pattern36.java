package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			char temp=(char)(ch+(2*i-2));
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(temp);
				temp--;
			}
			System.out.println();
		}
	}

}
