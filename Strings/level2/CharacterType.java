package com.gla.string.level2;

import java.util.Scanner;
public class CharacterType{
    public static String type(char ch){
        if(ch>='A'&&ch<='Z'){
            ch=(char)(ch+32);
        }
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }
        return "Not Letter";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i)+" "+type(s.charAt(i)));
        }
    }
}
