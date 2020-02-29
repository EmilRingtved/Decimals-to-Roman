package com.company;

import java.util.Scanner;

public class Arabic2Roman {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++){  // The for loop for running the program multiple times.
            String romanNum = "";
            System.out.println("Enter a natural number to convert");
            Scanner num = new Scanner(System.in);           // The user input
            int Num = num.nextInt();
            int remember = Num;       // saving the number for displaying later as another variable
            if (Num > 0) {
                while (Num >= 1000) { // Checking if there are any thousands in the given number
                    romanNum += "M";      // Adding an M to the string romanNum
                    Num -= 1000;          // Subtracting 1000 from the given number.
                }                     // If the number is now less than 1000, we go to the next while loop, else we go through the loop again.
                while (Num >= 900) {  // the Same as above now we just check for 900s to place the "C" before the "M"
                    romanNum += "CM";
                    Num -= 900;
                }
                while (Num >= 500) {  // ...
                    romanNum += "D";
                    Num -= 500;
                }
                while (Num >= 400) {  // ...
                    romanNum += "CD";
                    Num -= 400;
                }
                while (Num >= 100) {
                    romanNum += "C";
                    Num -= 100;
                }
                while (Num >= 90) {
                    romanNum += "XC";
                    Num -= 90;
                }
                while (Num >= 50) {
                    romanNum += "L";
                    Num -= 50;
                }
                while (Num >= 40) {
                    romanNum += "XL";
                    Num -= 40;
                }
                while (Num >= 10) {
                    romanNum += "X";
                    Num -= 10;
                }
                while (Num >= 9) {
                    romanNum += "IX";
                    Num -= 9;
                }
                while (Num >= 5) {
                    romanNum += "V";
                    Num -= 5;
                }
                while (Num >= 4) {
                    romanNum += "IV";
                    Num -= 4;
                }

                while (Num >= 1) {
                    romanNum += "I";
                    Num -= 1;
                }

                System.out.printf("You converted " + remember +" To: " + romanNum); //The given number is printed with the converted number
                System.out.println();
                System.out.println("Want to try another number?");
                System.out.println("Y/N");
                Scanner retry = new Scanner(System.in);       // New user input
                String reply = retry.next();
                if (reply.equals("Y") || reply.equals("y")) { // Subtract 1 from i, to keep the for loop running, if the user wants to run the program again
                    i--;
                }
                else {                                      // Add 1 to i if the user is done. this will satisfy the for loop and finish the program
                    i++;
                }
            }
            else System.out.print("Only natural number numbers please");
        }

    }
}

