package com.gla.string.level2;

import java.util.Scanner;
public class TrimSpaces{
    public static int[] range(String s){
        int st=0,en=s.length()-1;
        while(st<=en&&s.charAt(st)==' '){
            st++;
        }
        while(en>=st&&s.charAt(en)==' '){
            en--;
        }
        return new int[]{st,en+1};
    }
    public static String sub(String s,int st,int en){
        String r="";
        for(int i=st;i<en;i++){
            r=r+s.charAt(i);
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
        int[] r=range(s);
        String t1=sub(s,r[0],r[1]);
        String t2=s.trim();
        System.out.println(compare(t1,t2));
    }
}
