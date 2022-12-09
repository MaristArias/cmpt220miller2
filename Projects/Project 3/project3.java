import java.util.Scanner;
import java.io*;

public class Main {
    static void move (char room [][], int r, int c, int dir, int []pos) {
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
            
        else if (dir == 2) {
            c++;

