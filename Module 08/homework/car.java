package Module 08.homework;
//subclass
public class car extends transportationmethod {
    private int numofPass = 0;

    public car(String name, double speed, int number) {
        setName(name);
        setSpeed(speed);
        numofPass = number;
    }
    public int getPass(){
        return numofPass;
    }
    public double getTravtime(int distance){
        double n = getSpeed();
        return n;
    }

}
