package com.basics;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("**Program to find addition of two numbers**");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to add : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1+ num2;

        System.out.println("The addition of two numbers is : " + sum);
    }
}
