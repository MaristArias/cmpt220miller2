public class Train extends TransportationMethod {
    private int numofPass = 0;

    public Train(String name, double speed, int number){
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
