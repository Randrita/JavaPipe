package com.conditions;
import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        System.out.println("Code to find the largest number among three:");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers! ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if (num1>num2){

            if(num1>num3){
                System.out.println(num1+" is largest!");
            }}
        else if(num2>num3){
                System.out.println(num2+" is largest!");

            }
        else{
            System.out.println(num3+" is largest!");
        }
    }
}
