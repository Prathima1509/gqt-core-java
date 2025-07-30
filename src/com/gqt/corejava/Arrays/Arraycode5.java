/**
 * 
 */
package com.gqt.corejava.Arrays;

/**
 * 
 */
import java.util.Scanner;
class ArrayOperations1{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the school count:");
		int sch=sc.nextInt();
		System.out.println("Enter the class count in each school:");
		int cls=sc.nextInt();
		System.out.println("Enter the name of students count in each class:");
		int stu=sc.nextInt();
		arr=new String[sch][cls][stu];
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
public class Arraycode5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations1 ao=new ArrayOperations1();
		ao.createArray();
		ao.collectData();
		ao.displayData();

	}

}
