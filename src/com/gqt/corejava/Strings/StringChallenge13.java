package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("All permutations of " + str + " are:");
        findPermutations(str, "");
    }

    static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            findPermutations(remaining, ans + ch);
        }
	}

}
