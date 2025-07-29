package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			char ch=(char)('A'+i);
			for(char c=ch;c>'A';c--) {
				System.out.print(c);
			}
			for(char c='A';c<=ch;c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
