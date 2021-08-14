package Problems.BasicJava;
import java.util.Scanner;
public class PerimeterParallelogram {
    public static void main(String[] args) {
        System.out.print("Enter the height and width of Parallelogram: ");
        Scanner input=new Scanner (System.in);
        double p= input.nextInt();
        double q= input.nextInt();
        System.out.print("The perimeter of the parallelogram is: "+ 2*(p+q));

    }
}
