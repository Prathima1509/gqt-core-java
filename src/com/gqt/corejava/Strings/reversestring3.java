package com.gqt.corejava.Strings;
import java.util.Scanner;
public class reversestring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == ' ') {
                result.append(' ');
                i++;
            } else {
                int start = i;
                while (i < input.length() && input.charAt(i) != ' ') {
                    i++;
                }
                String word = input.substring(start, i);
                result.append(new StringBuilder(word).reverse());
            }
        }

        System.out.println("Output: " + result.toString());
	}

}
