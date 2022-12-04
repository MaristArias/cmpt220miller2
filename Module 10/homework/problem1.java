import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer:");
                int number = input.nextInt();

                // results
                System.out.println("The square of the integer is" + (number * number));
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "Incorrect input an integer is required)");
                input.nextLine();
            }
        } while (continueInput);

    }
}
