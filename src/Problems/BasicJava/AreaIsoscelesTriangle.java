package Problems.BasicJava;

import java.util.Scanner;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the base and height of the triangle:");
        Scanner input=new Scanner (System.in);
        double n= input.nextInt();
        double m= input.nextInt();
        System.out.print("The area of the triangle is: "+ (n*m)/2);
    }
}
