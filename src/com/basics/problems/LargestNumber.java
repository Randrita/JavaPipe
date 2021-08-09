package com.basics.problems;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Code to find the largest number: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers you want to compare : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1+" is greater.");
        }
        else{
            System.out.println(num2+" is greater.");
        }
    }
}
