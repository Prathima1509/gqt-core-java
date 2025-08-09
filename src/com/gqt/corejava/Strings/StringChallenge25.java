package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        if (n == 0) {
            System.out.println("No strings entered.");
            return;
        }

        int minLen = arr[0].length();
        for (int i = 1; i < n; i++) {
            if (arr[i].length() < minLen) {
                minLen = arr[i].length();
            }
        }

        String prefix = "";

        for (int i = 0; i < minLen; i++) {
            char ch = arr[0].charAt(i);
            boolean allMatch = true;

            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) != ch) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                prefix += ch;
            } else {
                break;
            }
        }

        if (prefix.equals("")) {
            System.out.println("No common prefix");
        } else {
            System.out.println("Longest Common Prefix: " + prefix);
        }

	}

}
