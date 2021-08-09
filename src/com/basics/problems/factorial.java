package com.basics.problems;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Code to print factorial of a number!");
        System.out.print("Enter the number to find its factorial : ");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int count =1;
        for(int i=n;i>=1;i--){
            count = count*i;
        }
        System.out.print("Factorial is : " + count);
    }
}
