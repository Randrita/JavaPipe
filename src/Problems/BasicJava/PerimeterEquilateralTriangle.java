package Problems.BasicJava;
import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the length of the side: ");
        Scanner input=new Scanner (System.in);
        double p= input.nextInt();

        System.out.print("The area of the equilateral triangle is: "+ 3*p);
    }
}
