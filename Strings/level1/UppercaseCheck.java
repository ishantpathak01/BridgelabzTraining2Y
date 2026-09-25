package com.gla.string.level1;

import java.util.Scanner;
public class UppercaseCheck{
    public static String toUpper(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                c=(char)(c-32);
            }
            r=r+c;
        }
        return r;
    }
    public static boolean compare(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(compare(toUpper(s),s.toUpperCase()));
    }
}
