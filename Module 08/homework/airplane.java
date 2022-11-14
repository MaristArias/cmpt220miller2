public class Airplane extends TransportationMethod{
    private int numofPass = 0;
    public Airplane(String name, double speed, int number){
        setName(name);
        setSpeed(speed);
        numofPass= number;
    }
    public int getPass;(){
        return numofPass;
    }
    public double getTravtime(int distance){
        double n = getSpeed();
        return n;
    }
}
