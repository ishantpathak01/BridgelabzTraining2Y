package com.gla.string.level1;

import java.util.Scanner;
public class StringIndex{
    public static void generate(String s){
        System.out.println(s.charAt(s.length()));
    }
    public static void handle(String s){
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
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
