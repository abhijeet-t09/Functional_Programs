package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static double harmonicValue(double N)
    {
        double val = 0.0;

        for (int i = 1; i <= N; i++)
        {
            val = val + (1.0 / i);
        }
        return val;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double N = in.nextInt();

        double result = harmonicValue(N);

        if(N>0)
        {
            for (int i = 1; i <= N; i++){
                if (i < N)
                    System.out.print("1/" + i + " + ");

                else
                    System.out.print("1/" + i + " = ");
            }
            System.out.print(result);
        }
    }
}
