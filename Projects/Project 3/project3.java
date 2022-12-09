import java.util.Scanner;
import java.io*;

public class Main {
    static void move (char room [][], int r, int c, int dir, int []pos) {
        // creating r and defining dir as well as using if else to define the positions of the walls
        if (dir == 0 ) {
            r==;
            while (room [r][c] == '.') r++;
            if (room [r][c] == '/')
                move (room r, c, 1, pos);
            else if (room [r][c] == '\\')
                move (room r, c, 2, pos);
            else {
                pos [0] = r; pos [1] = c;
                return;
            }
        }
        else if (dir == 1) {
            // creating c-- and using if else tp define the positions of the walls
            c--;
            while (room [r][c] == '.') c--;
            if (room [r][c] == '/')
               move (room, r, c, 0, pos);
            else if (room [r][c] == '\\')
                move(room, r, c, 3, pos);
            else {
                pos [0] = r; pos [1] = c;
                return;
            }
        }
            
        else if (dir == 2) {
            // if else for c++ defining another wall
            c++;
            while (room [r][c] == '.') c++;
            if (room [r][c] == '/')
                move (room, r, c, 3, pos);
            else if (room [r][c] == '\\')
                move (room, r, c, 0, pos);
            else {
                pos [0] = r; pos [1] = c;
                return;
            }
            }
            // defining r and wall positioning 
            else if (dir == 3) {
                r--;
                while (room [r][c] == '.') r--;
                if (room [r][c] == '/') 
                    move (room, r, c, 2, pos);
                else if (room [r][c] == '\\')
                    move (room, r, c, 1, pos);
                else {
                    pod [0] = r; pos [1] = c;
                    return;
                }
                }
            }
                 public static void main(String[] args) throws FileNotFoundException {
                    Scanner sc = new Scanner (new File ("input.txt"));
                    int house = 1;
                    while (true) {
                        int c = sc.nextInt ();
                        int r = sc.nextInt ();
                        if ((r == 0) || (c == 0)) break;
                        // moving the asterisk and using if else to determine if it needs to be switch with & aka entrance and exit
                        int startr = -1, startc = -1;
    		            char room [][] = new char [r][c];
    		            for (int i = 0; i < r; i++) {
    		                String wrd = sc.next ();
                            int j = 0;
                            for (charch : wrd.toCharArray()) {
                                if (Ch == '*') {
                                    startr = i; startc = j;

                                }
                                room [i] [j++] = ch;
                            }
                        }
                        // the length of the room
                        int end [] = new int [2];
    		            int dir;
    		            if (startr == 0) dir = 0;
                        else if (startc == 0) dir = 2;
                        else if (startr == room.length - 1) dir = 3;
                        else dir = 1;
                        move (room, startr, startc, dir, end);
                        room [end [0]][end [1]] = '&';
                        // print final fun house design 
    		            System.out.printf ("HOUSE %d\n", house++);
    		            for (int i = 0; i < r; i++) {
    		                for (int j = 0; j < c; j++)
    		                    System.out.print (room [i][j]);
    		                    System.out.println ();
    		}
        }
    }
}






        
        }
