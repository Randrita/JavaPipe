package Problems.BasicJava;
import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        System.out.print("Enter the radius and height of Cylinder: ");
        Scanner input=new Scanner (System.in);
        double r= input.nextInt();
        double h= input.nextInt();
        System.out.print("The volume of the prism is: "+ (int) Math.PI*r*r*h);
    }
}
