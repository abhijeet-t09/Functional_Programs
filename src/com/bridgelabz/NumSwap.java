package com.bridgelabz;

import java.util.Scanner;

public class NumSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number (Num_1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second Number (Num_2): ");
        int num2 = sc.nextInt();

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap....");
        System.out.println("Num_1 = " + num1);
        System.out.println("Num_2 = " + num2);
    }
}
