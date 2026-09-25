package com.gla.string.level3;

import java.util.Scanner;
public class CharFrequency{
    public static void freq(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(f[i]>0){
                System.out.println((char)i+" "+f[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        freq(s);
    }
}
