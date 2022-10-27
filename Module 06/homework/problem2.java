package Module 06.homework;
import java.util.Scanner;
public class Demo{
       public static void main(String[] args){
          int n, j = 0, k = 0;
          Scanner s = new Scanner(System.in);
          n = s.nextInt();
          int my_arr[] = new int[n];
          int odd_vals[] = new int[n];
          int even_vals[] = new int[n];
          System.out.println("Enter even and odd numbers :");
          for(int i = 0; i < n; i++){
             my_arr[i] = s.nextInt();
          }
          for(int i = 0; i < n; i++){
             if(my_arr[i] % 2 != 0){
                odd_vals[j] = my_arr[i];
                j++;
             } 
             else {
                even_vals[k] = my_arr[i];
                k++;
             }
          }
          System.out.print("The odd numbers in the list are : ");
          if(j > 1){
             for(int i = 0;i < (j-1); i++){
                if(odd_vals[i]==1){
                   System.out.println("1 is niether even nor odd");
                }
                else
                System.out.print(odd_vals[i]+",");
             }
             System.out.print(odd_vals[j-1]);
          } else {
             System.out.println("There are no odd numbers.");
          }
          System.out.println("");
          System.out.print("The even numbers in the list are: ");
          if(k > 1){
             for(int i = 0; i < (k-1); i++){
                if(even_vals[i]==1){
                   System.out.println("1 is niether even nor odd");
                }
                else
                System.out.print(even_vals[i]+",");
             }
             System.out.print(even_vals[k-1]);
          } else {
             System.out.println("There are no even numbers in the list.");
          }
       }
    } 

