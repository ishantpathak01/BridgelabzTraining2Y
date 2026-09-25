package com.gla.string.level2;

import java.util.Scanner;
public class StudentGrade{
    public static String grade(double p){
        if(p>=80){return "A";}
        if(p>=70){return "B";}
        if(p>=60){return "C";}
        if(p>=50){return "D";}
        if(p>=40){return "E";}
        return "R";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            int c=sc.nextInt();
            int m=sc.nextInt();
            int total=p+c+m;
            double per=Math.round((total/3.0)*100.0)/100.0;
            System.out.println(total+" "+per+" "+grade(per));
        }
    }
}
