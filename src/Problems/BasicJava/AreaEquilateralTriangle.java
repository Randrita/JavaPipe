package Problems.BasicJava;
import java.util.Scanner;
public class AreaEquilateralTriangle {
    public static void main(String[] args) {

            System.out.print("Enter the side of the triangle:");
            Scanner input=new Scanner (System.in);
            double a= input.nextDouble();

            System.out.print("The area of the triangle is: "+ (Math.sqrt(3)/4)*(Math.pow(a,2)));
        }
    }

