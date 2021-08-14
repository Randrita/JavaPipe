package Problems.BasicJava;
import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        System.out.print("Enter the side and height of Parallelogram: ");
        Scanner input=new Scanner (System.in);
        double a= input.nextInt();
        double h= input.nextInt();
        System.out.print("The volume of the prism is: "+ a*a*h);

    }
}
