package com.gla.string.level2;

import java.util.Scanner;
public class RockPaperScissors{
    public static String comp(){
        int r=(int)(Math.random()*3);
        if(r==0){return "rock";}
        if(r==1){return "paper";}
        return "scissors";
    }
    public static int win(String u,String c){
        if(u.equals(c)){return 0;}
        if(u.equals("rock")&&c.equals("scissors")){return 1;}
        if(u.equals("paper")&&c.equals("rock")){return 1;}
        if(u.equals("scissors")&&c.equals("paper")){return 1;}
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int user=0,comp=0;
        for(int i=0;i<n;i++){
            String u=sc.next();
            String c=comp();
            int r=win(u,c);
            if(r==1){user++;}
            if(r==-1){comp++;}
        }
        System.out.println(user);
        System.out.println(comp);
    }
}
