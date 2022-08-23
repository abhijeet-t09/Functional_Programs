package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("2 ^ " + i + " = " + ((int) Math.pow(2, i)));
        }
    }
}
