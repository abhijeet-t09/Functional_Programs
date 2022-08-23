package com.bridgelabz;

import java.util.Scanner;

public class NumLargest {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=in.nextInt();

        System.out.println("Enter second number: ");
        int num2=in.nextInt();

        System.out.println("Enter third number: ");
        int num3=in.nextInt();

        checkLargest(num1, num2, num3);
    }

    static void checkLargest(int num1, int num2, int num3){

        if(num1 > num2) {
            if (num1 > num3)
                System.out.println(num1 + " is the greatest number !!");
        }

        else if(num2 > num1) {
            if (num2 > num3)
                System.out.println(num2 + " is the greatest number !!");
        }

        else
            System.out.println(num3 + " is the greatest number !!");
    }
}
