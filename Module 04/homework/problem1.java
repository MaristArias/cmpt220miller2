package Module 04.homework;

    import java.util.Scanner;

public class problem1 {
    public static boolean checkPrime(int number){
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
      }
    }
    return true;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int start = n1+n2;
        while(true){
            if(checkPrime(start))
            {
                break;
            }
            else{
                start = start + 1;
            }
        }
    System.out.println("\nThe next prime number is " + start);
    }
}



