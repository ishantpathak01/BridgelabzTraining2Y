package com.gla.string.level3;

import java.util.Scanner;
public class UniqueFrequency{
    public static char[] unique(String s){
        char[] t=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    f=true;
                }
            }
            if(!f){
                t[k]=s.charAt(i);
                k++;
            }
        }
        char[] r=new char[k];
        for(int i=0;i<k;i++){
            r[i]=t[i];
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] u=unique(s);
        for(int i=0;i<u.length;i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(u[i]==s.charAt(j)){
                    c++;
                }
            }
            System.out.println(u[i]+" "+c);
        }
    }
}
