package Module 05.practice problems;

public class problem2 {
    public int countChar(String str, char c)
{
    String input = "Have a nice day!";
    char search = 'e';

    int count = 0;
    for(int i=0; i < str.length(); i++)
    {    if(str.charAt(i) == c)
            count++;
    }
    System.out.println("The Character'"+search+"' appears "=count+" times.";)
    return count;
    }
}
