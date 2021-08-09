package com.basics.problems;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        System.out.println("**Code to take string as input**");
        System.out.print("Enter the name of your friend to wish her : ");
        Scanner input=new Scanner(System.in);
        String name = input.next();
        System.out.print("Happy Birthday To You " + name + ". Stay Blessed!");

    }
}
