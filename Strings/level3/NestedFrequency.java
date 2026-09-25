package com.gla.string.level3;

import java.util.Scanner;
public class NestedFrequency{
    public static void freq(String s){
        char[] a=s.toCharArray();
        int[] f=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]=='0'){
                continue;
            }
            f[i]=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    f[i]++;
                    a[j]='0';
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!='0'){
                System.out.println(a[i]+" "+f[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        freq(s);
    }
}
