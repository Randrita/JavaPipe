//Find the nth fibonacci number
package com.conditions;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Code to find the nth fibonacci number: ");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= input.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println("The fibonacci number at " + n+ " position is: "+b);


    }
}
