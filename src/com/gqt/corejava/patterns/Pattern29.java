package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" 	");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" 	");
			}
			for(int z=i-1;z>=1;z--) {
				System.out.print(z+" 	");
			}
			System.out.println();
		}
	}

}
