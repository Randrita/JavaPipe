//Take integer inputs till the user enters 0 and print the sum of all numbers
package com.basics.problems;
import java.util.Scanner;
public class Sum {
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
                sum=sum+n;

        }
        System.out.println("The sum of all number: " +sum);
    }
}
}
