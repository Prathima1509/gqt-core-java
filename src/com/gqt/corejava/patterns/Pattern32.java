package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int p=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=p;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			if(i!=1) {
				for(int j=1;j<=2*(i-1)-1;j++) {
					System.out.print(" ");
				}
				System.out.print(i);
			}
			System.out.println();
			p--;
		}
		int q=1;
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=q;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			if(i!=1) {
				for(int j=1;j<=2*(i-1)-1;j++) {
					System.out.print(" ");
				}
				System.out.print(i);
			}
			System.out.println();
			q++;
		}
	}

}
