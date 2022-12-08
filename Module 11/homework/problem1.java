import java.util.*;

public class TestHashSet {
  public static void main(String[] args){
    //hash set
    Set<String> set = new HashSet<>();

    // strings
    set.add("George");
    set.add("Jackie");
    set.add("John");
    set.add("Lisa");
    set.add("Tim");
    set.add("Katie");
    set.add("Kevin");
    set.add("Michelle");
    set.add("Ryan");

    System.out.println(set);

    //display hash
    for (String s: set) {
        System.out.print(s.toUpperCase() + " ");

    }

    //process
    System.out.println();
    set.forEach(e -> System.out.print(e.toLowerCase() + ""));
}
}

