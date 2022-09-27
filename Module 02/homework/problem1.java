import java.util.Scanner;

// Be careful with the class names. They should match the 
// filenames
public class Problem1 {
    public static void main(String args[]) {
        double radius, diameter, circumference, area;
        Scanner op = new Scanner(System.in);
        /*
         * Input radius of circle from user
         */
        System.out.print("Enter radius of circle: ");
        radius = op.nextDouble();

        /*
         * Calculate diameter, circumference and area
         */
        diameter = 2 * radius;
        circumference = 2 * 3.14 * radius;
        area = 3.14 * (radius * radius);

        /*
         * Print all results
         */
        System.out.println("Diameter of circle = " + diameter + " units ");
        System.out.println("Circumference of circle = " + circumference + " units ");
        System.out.println("Area of circle = " + area + " sq. units ");
    }
}
