public class TransportationMethod {

    private String name = "";
    private double speed = 0;

    public TransportationMethod() {
    }

    public TransportationMethod(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public double getspeed() {
        return this.speed;

    }
}
//