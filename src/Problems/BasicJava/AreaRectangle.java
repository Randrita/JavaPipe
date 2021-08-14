package Problems.BasicJava;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.print("Enter the weight and length of the triangle:");
        Scanner input=new Scanner (System.in);
        double n= input.nextInt();
        double m= input.nextInt();
        System.out.print("The area of the rectangle is: "+ (n*m));
    }
}
