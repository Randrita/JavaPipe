package Problems.BasicJava;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        double pi=3.14;
        System.out.print("Enter the radius of the circle:");
        Scanner input=new Scanner (System.in);
        double n= input.nextInt();
        System.out.print("The area of the circle is: "+ pi*n*n);



    }
}
