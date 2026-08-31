package com.gla.string.level1;
import java.util.Scanner;
public class ArrayIndex{
    public static void generate(String[] a){
        System.out.println(a[a.length]);
    }
    public static void handle(String[] a){
        try{
            System.out.println(a[a.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        try{
            generate(a);
        }catch(Exception e){
        }
        handle(a);
    }
}
