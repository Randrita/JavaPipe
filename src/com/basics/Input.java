package com.basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Hello! Enter your roll no. - ");
        Scanner roll_no = new Scanner(System.in);
        int k = roll_no.nextInt();
        System.out.print("Your Roll Number is : " + k);
    }
}
