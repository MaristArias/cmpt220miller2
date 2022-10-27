import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double average;
            int count = 0, sum = 0, num, min = 0, max = 0;
            System.out.println("Please enter three numbers");
            do {
                num = scan.nextInt();
                sum += num;
                count++;
            } while (count < 5);
            average = sum / 5;
            {
                if (num > max) {
                    max = num;
                }
    
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("The average is: " + average);
            System.out.println("The sum is: " + sum);    
            System.out.println("The max number is: " + max);
            System.out.println("The min number is: " + min);
        }
    }