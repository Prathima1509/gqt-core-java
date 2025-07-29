package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			for(char ch='A';ch<='A'+i;ch++) {
				System.out.print(ch);
			}
			for(char ch=(char)('A'+i-1);ch>='A';ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
