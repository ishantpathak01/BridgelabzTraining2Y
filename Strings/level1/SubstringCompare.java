package com.gla.string.level1;
import java.util.Scanner;

    public class SubstringCompare {

        public static String substringUsingCharAt(String text, int start, int end) {
            StringBuilder result = new StringBuilder();
            for (int i = start; i < end; i++) {
                result.append(text.charAt(i));
            }
            return result.toString();
        }
        public static boolean compareStringsUsingCharAt(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String text = sc.next();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();

            System.out.print("Enter end index: ");
            int end = sc.nextInt();
            if (start < 0 || end > text.length() || start > end) {
                System.out.println("Invalid start or end index!");
                sc.close();
                return;
            }

            String sub1 = substringUsingCharAt(text, start, end);
            String sub2 = text.substring(start, end);

            boolean isSame = compareStringsUsingCharAt(sub1, sub2);

            System.out.println("\nSubstring using charAt(): " + sub1);
            System.out.println("Substring using substring(): " + sub2);
            System.out.println("Are both substrings equal? " + isSame);

            sc.close();
        }
    }
