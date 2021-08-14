package Problems.BasicJava;
import java.util.Scanner;
public class AreaRhombus {
    public static void main(String[] args) {

            System.out.print("Enter the length of the diagonals of Rhombus: ");
            Scanner input=new Scanner (System.in);
            double p= input.nextInt();
            double q= input.nextInt();
            System.out.print("The area of the triangle is: "+ (p*q)/2);
        }
    }

