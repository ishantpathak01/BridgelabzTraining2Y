package com.gla.string.level1;

import java.util.Scanner;
public class IllegalArg{
    public static void generate(String s){
        System.out.println(s.substring(5,2));
    }
    public static void handle(String s){
        try{
            System.out.println(s.substring(5,2));
        }catch(IllegalArgumentException e){
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
