package Problems.BasicJava;
import java.util.Scanner;
public class PerimeterRhombus {
    public static void main(String[] args) {

        System.out.print("Enter the length of the rhombus: ");
        Scanner input=new Scanner (System.in);
        double p= input.nextInt();

        System.out.print("The perimeter of the rhombus is: "+ 4*p);
    }
}
