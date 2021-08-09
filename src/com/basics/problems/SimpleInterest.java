package com.basics.problems;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("**Code to find Simple Interest!**");
        System.out.print("Enter the principal amount : ");
        Scanner input = new Scanner(System.in);
        int p= input.nextInt();

        System.out.print("Enter the rate of interest : ");
        int s= input.nextInt();

        System.out.print("Enter the total number of years : ");
        int y= input.nextInt();
        int k=1;
        int interest = (p*s*y)/100;

        System.out.println("The simple interest is : " + interest);
        System.out.println("The simple principal amount is : " + (interest+p));

    }
}
