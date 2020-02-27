package com.company;

import java.util.Scanner;

public class Arabic2Roman {


    public static void main(String[] args) {
        String S = "";
        System.out.println("Enter positive integer to convert");
        Scanner num = new Scanner(System.in);
        int Num = num.nextInt();
        if (Num > 0 )
       {
           while (Num >= 1000) {
               S+="M";

               Num -= 1000;
           }
           while (Num >= 900) {
               S+="CM";

               Num -= 900;
           }
           while (Num >= 500) {
               S+="D";

               Num -= 500;
           }
           while (Num >= 400) {
               S+="CD";

               Num -= 400;
           }
           while (Num >= 100) {
               S+="C";

               Num -= 100;
           }
           while (Num >= 90) {
               S+="XC";

               Num -= 90;
           }
           while (Num >= 50) {
               S+="L";

               Num -= 50;
           }
           while (Num >= 40) {
               S+="XL";

           Num -= 40;
           }

           while (Num >= 10) {
               S+="X";

               Num -= 10;
           }
           while (Num >= 9) {
              S+="IX";

               Num -= 9;
           }
           while (Num >= 5) {
               S+="V";

               Num -= 5;
           }
           while (Num >= 4) {
               S+="IV";

               Num -= 4;
           }
           while (Num >= 1) {
               S+="I";

               Num -= 1;
           }
           System.out.printf(S);
           }
       else System.out.print("Only positive real numbers");
        }
    }
