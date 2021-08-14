package Problems.BasicJava;
import java.util.Scanner;
public class PerimeterSquare {
    public static void main(String[] args) {
        System.out.print("Enter the length of the square: ");
        Scanner input=new Scanner (System.in);
        double p= input.nextInt();

        System.out.print("The perimeter of the square is: "+ 4*p);
    }
}
