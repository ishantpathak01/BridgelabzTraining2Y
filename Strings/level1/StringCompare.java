package com.gla.string.level1;
import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        boolean isSame = true;
        if (s1.length() != s2.length()) {
            isSame = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
        }
        System.out.println("\nResult using charAt(): " + isSame);
        boolean equalsResult = s1.equals(s2);
        System.out.println("Result using equals(): " + equalsResult);
    }

}
