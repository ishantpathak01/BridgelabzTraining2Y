package com.gla.string.level3;

import java.util.Scanner;
public class PalindromeCheck{
    public static boolean method1(String s){
        int st=0,en=s.length()-1;
        while(st<en){
            if(s.charAt(st)!=s.charAt(en)){
                return false;
            }
            st++;
            en--;
        }
        return true;
    }
    public static boolean method2(String s,int st,int en){
        if(st>=en){
            return true;
        }
        if(s.charAt(st)!=s.charAt(en)){
            return false;
        }
        return method2(s,st+1,en-1);
    }
    public static boolean method3(String s){
        char[] a=s.toCharArray();
        char[] r=new char[a.length];
        for(int i=0;i<a.length;i++){
            r[i]=a[a.length-1-i];
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=r[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(method1(s));
        System.out.println(method2(s,0,s.length()-1));
        System.out.println(method3(s));
    }
}
