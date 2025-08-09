package com.gqt.corejava.Strings;

public class Mutableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("RAMANAYANA");
		StringBuffer sb2=new StringBuffer(" IS THE BEST MYTHOLOGICAL STORY");
		sb1.append(sb2);
		System.out.println(sb1);
		StringBuilder sb3=new StringBuilder("MAHABARATHA");
		StringBuilder sb4=new StringBuilder(" IS THE BEST MYTHOLOGICAL HISTORY");
		sb3.append(sb4);
		System.out.println(sb3);
		
	}

}
