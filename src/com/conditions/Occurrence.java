//count the number of occurrences of a number
package com.conditions;
import java.util.Scanner;
public class Occurrence {
    public static void main(String[] args) {
        //division method and modulo operator
        System.out.print("Enter the original number:");
        Scanner input= new Scanner(System.in);
        long n = input.nextLong();
        System.out.print("Enter the number you want to check:");
        int k = input.nextInt();
        int count=0;
        while(n>0){

            long rem=n%10;
            if(rem==k){
                count++;
            }
            n=n/10;


        }
        if (count>0){
            System.out.println("No. of occurrences: "+count);
        }
        else{
            System.out.println("No. doesn't exist!");
        }



    }
}
