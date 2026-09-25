package com.gla.string.level2;

import java.util.Scanner;
public class VotingCheck{
    public static String[][] result(int[] age){
        String[][] a=new String[age.length][2];
        for(int i=0;i<age.length;i++){
            a[i][0]=String.valueOf(age[i]);
            if(age[i]>=18){
                a[i][1]="Can Vote";
            }else{
                a[i][1]="Cannot Vote";
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] age=new int[n];
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();
        }
        String[][] r=result(age);
        for(int i=0;i<n;i++){
            System.out.println(r[i][0]+" "+r[i][1]);
        }
    }
}
