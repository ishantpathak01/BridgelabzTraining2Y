package com.gla.string.level3;

import java.util.Scanner;
public class UniqueChars{
    public static char[] unique(String s){
        char[] temp=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    found=true;
                }
            }
            if(!found){
                temp[k]=s.charAt(i);
                k++;
            }
        }
        char[] r=new char[k];
        for(int i=0;i<k;i++){
            r[i]=temp[i];
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] r=unique(s);
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
