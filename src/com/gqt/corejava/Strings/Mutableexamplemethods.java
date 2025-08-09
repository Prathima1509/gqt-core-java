package com.gqt.corejava.Strings;

public class Mutableexamplemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("Ramayana");
		//1.length()
		int len=sb1.length();
		System.out.println("The length of string is:"+len);
		//2.charAt()
		char c1=sb1.charAt(0);
		System.out.println("The character at 0th position is:"+c1);
		//3.append()
		sb1=sb1.append("Mahabaratha");
		System.out.println(sb1);
		//class()
		Class class1=sb1.getClass();
		System.out.println(class1);
		//hashCode()
		int hashcode=sb1.hashCode();
		System.out.println("The hashcode value of string is"+hashcode);
		//indexOf()
		int index1=sb1.indexOf("R");
		System.out.println("The index of R is:"+index1);
		index1=sb1.indexOf("Z");
		System.out.println("The index of Z is:"+index1);
		//isEmpty()
		boolean res1=sb1.isEmpty();
		System.out.println(res1);
		//lastIndexOf
		int lastindex=sb1.lastIndexOf("n");
		System.out.println("The last index of n is:"+lastindex);
		lastindex=sb1.lastIndexOf("n", 2);
		System.out.println("The last index of n is:"+lastindex);
	    lastindex=sb1.lastIndexOf("z");
	    System.out.println("The last index of z is:"+lastindex);
	    //replace
	    StringBuffer replace=sb1.replace(2,4,"$");
	    System.out.println("The replaced string is:"+replace);
	    //capacity
	    int capacity=sb1.capacity();
	    System.out.println("The capacity of string is:"+capacity);
	    //delete
	    StringBuffer delete=sb1.delete(1, 7);
	    System.out.println(delete);
	    delete=sb1.deleteCharAt(5);
	    System.out.println(delete);
	    //reverse
	    StringBuffer reverse=sb1.reverse();
	    System.out.println(reverse);
		
	}

}
