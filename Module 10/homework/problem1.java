import java.util;

public class static inputexception (String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;


    do {
        try {
            System.out.print("Enter an integer:" num );
            int number = input.nextInt();

            //results
            System.outPrintln( "The square of the integer is" + (n * n));
            continueInput = false;            
        }
        catch (InputMismatchException ex) {
            System.outPrintln ("Try again. (" + "Incorrect input an integer is required)");
            input.nextLine(); 
        
        }
        while (continueInput);

    }
}

