package com.Switch;
import java.util.Scanner;

public class EnhancedSkipSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays!");
            case 6, 7 -> System.out.println("Weekends!");
        }
    }
}