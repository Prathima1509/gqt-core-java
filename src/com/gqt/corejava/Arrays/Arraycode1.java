package com.gqt.corejava.Arrays;
import java.util.Scanner;
public class Arraycode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student count:");
		int n=sc.nextInt();
//		creating the array to store n students marks
		int arr[]=new int[n];
//		collecting and storing marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of students no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no:"+(i+1)+"is="+arr[i]);
		}
		
	}

}
