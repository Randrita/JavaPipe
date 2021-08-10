//Take integer inputs till the user enters 0 and print the largest number from all
package com.basics.problems;

import java.util.Scanner;

public class LargestUserInput {
    public static void main(String[] args) {
        int sum=0;
        boolean k = true;
        Scanner input = new Scanner(System.in);
        while(k){
            System.out.println("Enter the numbers you wanna add: ");
            int n= input.nextInt();
            if (n==0){
                k=false;
            }
            else {
                if(n>sum){
                    sum=n;
                }

            }
        System.out.println("The largest number among all is: " +sum);
        }
    }
    }

