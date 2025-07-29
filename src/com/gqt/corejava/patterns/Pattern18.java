package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1:");
		int n1=sc.nextInt();
		System.out.println("Enter the size of n2:");
		int n2=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n2;j++) {
				if((i+j)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
