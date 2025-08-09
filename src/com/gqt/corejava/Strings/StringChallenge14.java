package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character occurrences:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && (char)i != ' ') {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
	}

}
