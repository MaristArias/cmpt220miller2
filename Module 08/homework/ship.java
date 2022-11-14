
public class Ship extends TransportationMethod{
    private int numofPass = 0;

    public Ship(String name, double speed, int number){
        setName(name);
        setSpeed(speed);
        numofPass = number;
    }
    public int getPass(){
        return numofPass = 0;
    }
    public double getTravtime(int distance){
        double n = getSpeed();
        return n;
    }

    
    
}
