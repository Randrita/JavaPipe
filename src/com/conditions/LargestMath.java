package com.conditions;
import java.util.Scanner;

public class LargestMath {
    public static void main(String[] args) {
        System.out.println("Code to find the largest number among three:");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        int max=Math.max(num3,Math.max(num1,num2));
        System.out.println("The largest number: "+max );
    }
}
