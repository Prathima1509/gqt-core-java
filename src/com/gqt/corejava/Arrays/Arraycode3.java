package com.gqt.corejava.Arrays;

import java.util.Scanner;

class Actions{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the class count:");
		int cls=sc.nextInt();
		System.out.println("Enter the student count in each class:");
		int stu=sc.nextInt();
		arr=new String[cls][stu];
		System.out.println("Array created");
		System.out.println("--------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student no:"+(j+1));
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Data collected");
		System.out.println("--------------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student no:"+(j+1)+"is="+arr[i][j]);
			}
		}
		System.out.println("---------------");
	}
}
public class Arraycode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actions ao=new Actions();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
