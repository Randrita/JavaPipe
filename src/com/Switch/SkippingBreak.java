package com.Switch;
import java.util.Scanner;



public class SkippingBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays!");
                break;
            case 6:
            case 7:
                System.out.println("Weekends!");
                break;
        }
    }
}