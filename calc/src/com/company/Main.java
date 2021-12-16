package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double num1;
        double num2;
        String operation;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        num1 = input.nextInt();
        System.out.println("Please enter the second number");
        num2 = input.nextInt();
        Scanner op = new Scanner(System.in);
        System.out.println("Please enter operation");
        operation = op.next();
        if (operation.equals("+"))
        {
            System.out.println("Your answer is" + (num1 + num2));
        }
        if (operation.equals("-"))
        {
            System.out.println("Your answer is" + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println("Your answer is" + (num1 / num2));
        }
        if (operation.equals("+"))
        {
            System.out.println("Your answer is" + (num1 * num2));
        }
    }
}
