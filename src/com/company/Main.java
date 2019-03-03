package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter Your String:");
        Scanner sc=new Scanner(System.in);
        String data=sc.next();
        char[] chardata=data.toCharArray();
        char[] charEncry=toEncry(chardata);
        System.out.println(charEncry);

    }

    public static char[] toEncry(char[] rawData){

        char[] result=new char[rawData.length];
        for(int i=0;i<rawData.length;i++){
            result[i]=(char)((((int)rawData[i]+((int)rawData[(i+1)%(rawData.length)])%96)));
        }
//        System.out.println(result);
        return result;
    }
}
//%(rawData.length)