package com.gla.string.level3;

import java.util.Scanner;
public class CalendarDisplay{
    public static boolean leap(int y){
        if(y%400==0){return true;}
        if(y%100==0){return false;}
        return y%4==0;
    }
    public static int days(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2&&leap(y)){
            return 29;
        }
        return d[m-1];
    }
    public static int firstDay(int m,int y){
        int d=1;
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (d+x+31*m0/12)%7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int f=firstDay(m,y);
        int n=days(m,y);
        for(int i=0;i<f;i++){
            System.out.print("    ");
        }
        for(int i=1;i<=n;i++){
            System.out.printf("%3d ",i);
            if((i+f)%7==0){
                System.out.println();
            }
        }
    }
}
