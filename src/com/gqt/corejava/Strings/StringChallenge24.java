package com.gqt.corejava.Strings;
import java.util.Scanner;
public class StringChallenge24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the pattern string: ");
        String pattern = sc.nextLine();
        sc.close();

        int NO_OF_CHARS = 256;
        int len1 = str.length();
        int len2 = pattern.length();

        if (len1 < len2) {
            System.out.println("No such window");
            return;
        }

        int[] patFreq = new int[NO_OF_CHARS];
        int[] strFreq = new int[NO_OF_CHARS];
        for (int i = 0; i < len2; i++) {
            patFreq[pattern.charAt(i)]++;
        }

        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE;
        int count = 0;

        // Traverse the main string
        for (int end = 0; end < len1; end++) {
            char ch = str.charAt(end);
            strFreq[ch]++;

            if (patFreq[ch] != 0 && strFreq[ch] <= patFreq[ch]) {
                count++;
            }
            if (count == len2) {
                while (strFreq[str.charAt(start)] > patFreq[str.charAt(start)]
                        || patFreq[str.charAt(start)] == 0) {
                    if (strFreq[str.charAt(start)] > patFreq[str.charAt(start)]) {
                        strFreq[str.charAt(start)]--;
                    }
                    start++;
                }

                int windowLen = end - start + 1;
                if (minLen > windowLen) {
                    minLen = windowLen;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1) {
            System.out.println("No such window");
        } else {
            System.out.println("Smallest window: " + str.substring(startIndex, startIndex + minLen));
        }
	}

}
