package Module

import javax.sound.midi.Track;

08.homework;

public class train extends transportationmethod {
    private int numofPass = 0;

    public train(String name, double speed, int number){
        setName(name);
        setSpeed(speed);
        numofPass = number;
    }
    public int getPass(){
        return numofPass;
    }
    public double getTravTime(int distance) {
        double n = getSpeed();
        return n;
    }
    
}
