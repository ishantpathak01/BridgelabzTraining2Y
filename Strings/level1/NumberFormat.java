package com.gla.string.level1;

import java.util.Scanner;
public class NumberFormat{
    public static void generate(String s){
        int n=Integer.parseInt(s);
        System.out.println(n);
    }
    public static void handle(String s){
        try{
            int n=Integer.parseInt(s);
            System.out.println(n);
        }catch(NumberFormatException e){
            System.out.println("Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            generate(s);
        }catch(Exception e){
        }
        handle(s);
    }
}
