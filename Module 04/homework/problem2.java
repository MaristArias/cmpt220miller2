package Module 04.homework;

    import java.util.Scanner;

public class problem2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to calculate the value of π");
        int n=sc.nextInt();

        double pi=0;
        double sign=1.0;

        for(int i =0;i<n;i++)
        {
            pi+=sign/((2*i)+1);
        //At every next element,sign will change
            sign*=-1;    //sign=sign*(-1);
        }
        System.out.println(pi*4);
    }

}

