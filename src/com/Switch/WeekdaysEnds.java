package com.Switch;
import java.util.Scanner;

public class WeekdaysEnds {
    public static void main(String[] args) {
        //switch
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        switch (n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Enter a valid number!");
        }

    }
}
