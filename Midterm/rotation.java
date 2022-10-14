/* Online Java Compiler and Editor */
//java rotation porgram
import java.util.*;
class rotation {

    // rotates left
    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
     }
     //rotate right 
     static String rightrotate(String str, int d)
     {
         return leftrotate(str, str.length() - d);
     }
     public static void main(String args[])
     {
         String str1 = "Time files when you're having fun";
         System.out.println(leftrotate(str1,2));
         String str2 = "Time files when you're having fun";
         System.out.println(rightrotate(str2,2));
     }
     { 
     // returns the smallest alp
     public static char smallest_alp(String a, int n)
     { 
         char min = 'Z';
         
         for (int i=0; i<n-1; i++)
            if (a.charAt(i) <min)
                min = a.charAt(i);
        return min;
     }
     {
    // returns largest alp
     public static char largest_alp(String a, int n)
     { 
         char max = 'A';
         for (int i=0; i<n; i++)
            if (a.charAt(i) > max)
                max = a.charAt(i);
     }
     public static void main(String args[])
     {
         // string from above
         str1= "Time files when you're having fun";
         //string size
         int size = a.length();
         // return value
         System.out.println("largest_alp(a,size");
         System.out.println("smallest_alp(a,size");
         
     }
         
}