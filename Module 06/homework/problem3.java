package Module 06.homework;

public class problem3 {
    import java.util.ArrayList;
 {
    public static void main(String[] args)
    {
        ArrayList<String>
            list1 = new ArrayList<String>();
  
        // Add values in ArrayList
        list1.add("cindy");
        list1.add("olivia");
        list1.add("samantha");
        list1.add("Sabrina");
  
        System.out.println("List1: "
                           + list1);
  
        ArrayList<String>
            list2 = new ArrayList<String>();
  
        // Add values in ArrayList
        list2.add("Sabrina");
        list2.add("cindy");
        list2.add("amanda");
  
        System.out.println("List2: "
                           + list2);
  
        // Find the common elements
        list1.retainAll(list2);
  
        System.out.println("Common elements: "
                           + list1);
    }
}
    
}
