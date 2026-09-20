package com.gla.string.level2;

import java.util.Scanner;
public class WordLength2D{
    public static int length(String s){
        int c=0;
        try{
            while(true){
                s.charAt(c);
                c++;
            }
        }catch(Exception e){
        }
        return c;
    }
    public static String[] split(String s){
        int n=length(s);
        int words=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                words++;
            }
        }
        String[] arr=new String[words];
        int start=0,index=0;
        for(int i=0;i<=n;i++){
            if(i==n||s.charAt(i)==' '){
                String w="";
                for(int j=start;j<i;j++){
                    w=w+s.charAt(j);
                }
                arr[index]=w;
                index++;
                start=i+1;
            }
        }
        return arr;
    }
    public static String[][] make2D(String[] words){
        String[][] a=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            a[i][0]=words[i];
            a[i][1]=String.valueOf(length(words[i]));
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] a=make2D(split(s));
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0]+" "+a[i][1]);
        }
    }
}
