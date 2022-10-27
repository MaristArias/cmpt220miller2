package Module 05.practice problems;

public class problem3 {
class GFG{
    public static void main(String[] args)
    {

        int n = 4;
       
        String names[]
            = { "Nicole", "Sabrina", "Nick", "Ryan" };
        String ordr;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    ordr = names[i];
                    names[i] = names[j];
                    names[j] = ordr;
                }
            }
        }
       
        System.out.println( "The alphabetical order is: ");

        for (int i = 0; i < n; i++) {

            System.out.println(names[i]);
        }
    }
}
}
