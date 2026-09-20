
package com.gla.string.level1;
import java.util.Scanner;

public class CharArrayCompare {

        public static char[] getCharsUsingCharAt(String text) {
            char[] chars = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                chars[i] = text.charAt(i);
            }
            return chars;
        }

        public static boolean compareCharArrays(char[] arr1, char[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the string: ");
            String text = sc.next();

            char[] userChars = getCharsUsingCharAt(text);

            char[] builtInChars = text.toCharArray();
            boolean isSame = compareCharArrays(userChars, builtInChars);
            System.out.println("\nCharacters using user-defined method:");
            for (char c : userChars) {
                System.out.print(c + " ");
            }

            System.out.println("\nCharacters using toCharArray():");
            for (char c : builtInChars) {
                System.out.print(c + " ");
            }

            System.out.println("\n\nAre both character arrays equal? " + isSame);

            sc.close();
        }
    }
