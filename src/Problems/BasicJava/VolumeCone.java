package Problems.BasicJava;
import java.util.Scanner;
public class VolumeCone {
    public static void main(String[] args) {
        System.out.print("Enter the radius and height of Parallelogram: ");
        Scanner input=new Scanner (System.in);
        double r= input.nextInt();
        double h= input.nextInt();
        System.out.print("The volume of the cone is: "+ Math.PI*Math.pow(r,2)*(h/3));
    }
}
