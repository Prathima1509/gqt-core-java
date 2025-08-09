package com.gqt.corejava.Strings;

import java.util.Scanner;

public class StringChallenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.println("Character occurrences:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0 && (char)i != ' ') {
                System.out.println((char)i + " -> " + count[i]);
            }
        }

        sc.close();
    }
}
