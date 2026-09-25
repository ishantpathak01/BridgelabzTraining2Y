package com.gla.string.level2;

import java.util.Scanner;
public class SplitWords{
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
    public static boolean compare(String[] a,String[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(compare(split(s),s.split(" ")));
    }
}
