//Input a number and print all the factors of that number (use loops).
package com.basics.problems;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        System.out.println("**Code to find the factors of a  number**");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers to find its factor : ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            //if a number is divided by i
            //then i is a factor
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
