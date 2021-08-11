package com.conditions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter the original number:");
        Scanner input= new Scanner(System.in);
        long n = input.nextLong();
        long ans=0;
        while(n>0){
            long k;

            k= n%10;
            n=n/10;
            ans=ans*10+k;

        }
        System.out.println("array in reverse :"+ ans);
    }
}

