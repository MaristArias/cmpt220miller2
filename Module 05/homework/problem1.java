//package Module 05.homework;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        //create an instance of Scanner class
        Scanner input = new Scanner(System.in);
        //declare long integer variable n
        long n;
        //prompt user to enter an integer
        System.out.print("Enter an integer: ");
        //read n
        n = input.nextLong();
        //call sumDigits() and display result
        System.out.println("Sum of digits: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        //declare integer variables sum and remainder
        //initialize sum with 0
        int sum = 0, remainder;
        //while loop executes as long as n>0
        while (n > 0) {
            //extract the last digit of the number
            remainder = (int) n % 10;
            //add last digit into sum
            sum = sum + remainder;
            //remove the last digit from n
            n = n / 10;
        }
        return sum;
    }
}