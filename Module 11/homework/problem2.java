package Module 11.homework;
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        String fileName;
        System.out.println("Enter file name : ");
        Scanner sc=new Scanner(System.in);
        fileName=sc.nextLine();
        file file = new File(fileName);
        try {
            Scanner = new Scanner(file);
            while (scan.hasNext());{
                    set.add(scan.next());

        }
        
    }
        System.out.println(set);
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }

    
}
