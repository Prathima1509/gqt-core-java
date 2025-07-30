/**
 * 
 */
package com.gqt.corejava.Arrays;

/**
 * 
 */
import java.util.Scanner;
class ArrayOperations2{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the school count:");
		int sch=sc.nextInt();
		arr=new String[sch][][];
//		collecting class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count inside the school no"+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
//		collecting student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school no");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the students count in each class no:"+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}
		System.out.println("Array created");
		System.out.println("--------------");
		
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student no:"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data collected");
		System.out.println("--------------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student no:"+(k+1)+"is ="+arr[i][j][k]);
				}
			}
		}
		System.out.println("---------------");
	}
}
public class Arraycode6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations2 ao=new ArrayOperations2();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
