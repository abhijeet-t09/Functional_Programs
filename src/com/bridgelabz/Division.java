package com.bridgelabz;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        float Quotient = (dividend / divisor);
        float Remainder = (dividend % divisor);

        System.out.println("The Quotient is = " + Quotient);
        System.out.println("The Remainder is = " + Remainder);
    }
}
