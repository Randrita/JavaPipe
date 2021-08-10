//find the first character of a string is uppercase or lowercase
package com.conditions;
import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {

        System.out.print("Enter the string: ");
        Scanner input= new Scanner(System.in);

        char c=input.next().trim().charAt(0);
        if (c>='a' && c<='z'){
            System.out.println(c+" is lowercase");
        }

        else{
            System.out.println(c+" is Uppercase");
        }
    }
}
