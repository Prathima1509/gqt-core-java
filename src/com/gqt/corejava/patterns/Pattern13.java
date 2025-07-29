package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count:");
		int n=sc.nextInt();
		int p;
		for(int i=1;i<=n;i++) {
			p=i;
			for(int j=1;j<=n;j++) {
				System.out.print(p+"  ");
				p=p+n;
			}
			System.out.println();
		}
	}

}
