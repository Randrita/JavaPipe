package Problems.BasicJava;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        Scanner input=new Scanner (System.in);
        double r= input.nextInt();
        /*double q= input.nextInt();*/
        System.out.print("The perimeter of the circle is: "+ 2*Math.PI*r);
    }
}
