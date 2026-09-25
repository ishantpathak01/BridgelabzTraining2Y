package com.gla.string.level2;

import java.util.Scanner;
public class ShortLongWord{
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
    public static int[] find(String[] a){
        int min=0,max=0;
        for(int i=1;i<a.length;i++){
            if(length(a[i])<length(a[min])){
                min=i;
            }
            if(length(a[i])>length(a[max])){
                max=i;
            }
        }
        return new int[]{min,max};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] w=split(s);
        int[] r=find(w);
        System.out.println(w[r[0]]);
        System.out.println(w[r[1]]);
    }
}
