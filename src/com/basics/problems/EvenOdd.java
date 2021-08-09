package com.basics.problems;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("**Code to find the number is even or odd**");
        System.out.print("Enter the number to check its even or not : ");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        if(n%2==0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }

    }
}
