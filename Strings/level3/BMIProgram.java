package com.gla.string.level3;

import java.util.Scanner;
public class BMIProgram{
    public static String status(double bmi){
        if(bmi<18.5){return "Underweight";}
        if(bmi<25){return "Normal";}
        if(bmi<30){return "Overweight";}
        return "Obese";
    }
    public static String[][] compute(double[][] a){
        String[][] r=new String[a.length][4];
        for(int i=0;i<a.length;i++){
            double w=a[i][0];
            double h=a[i][1]/100.0;
            double bmi=w/(h*h);
            r[i][0]=String.valueOf(a[i][1]);
            r[i][1]=String.valueOf(a[i][0]);
            r[i][2]=String.valueOf(Math.round(bmi*100.0)/100.0);
            r[i][3]=status(bmi);
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] a=new double[10][2];
        for(int i=0;i<10;i++){
            a[i][0]=sc.nextDouble();
            a[i][1]=sc.nextDouble();
        }
        String[][] r=compute(a);
        for(int i=0;i<10;i++){
            System.out.println(r[i][0]+" "+r[i][1]+" "+r[i][2]+" "+r[i][3]);
        }
    }
}
