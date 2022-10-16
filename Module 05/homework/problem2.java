//package Module 05.homework;
public class problem2 {
    public static String reverseCase(String s) {
        // copy into the character array
        char str[] = s.toCharArray();

        // change the case
        for (int i = 0; i < str.length; i++) {
            if (Character.isUpperCase(str[i])) {
                str[i] = Character.toLowerCase(str[i]);
            } else if (Character.isLowerCase(str[i])) {
                str[i] = Character.toUpperCase(str[i]);
            } else {
                str[i] = str[i];
            }
        }

        // copy str to s
        s = new String(str);

        // return statement
        return s;
    }
}