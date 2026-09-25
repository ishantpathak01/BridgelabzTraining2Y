package com.gla.string.level1;

public class NullPointer{
    public static void generate(){
        String s=null;
        System.out.println(s.length());
    }
    public static void handle(){
        try{
            String s=null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Handled");
        }
    }
    public static void main(String[] args){
        try{
            generate();
        }catch(Exception e){
        }
        handle();
    }
}
