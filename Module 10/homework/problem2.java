//package Module

public class Problem2 {
    public static void main(String[] args) {
        
    // radius of circle
    private double radius;
    // number of ojects
    private static int numberOfbjects = 0;
    // construct
    public CircleWithRadiusException();{
      this.(1.0);
    }
    // construct circle w certain radius
    public CircleWithRadiusException(double newRadius) {
        try {
            setRadius(newRadius);
            numberOfObjects++;
        }
        catch (InvalidRadiusException ex) {
            ex.printStackTrace();
        }
    }
    // return radius
    public double getRadius() {
        return radius;
    }
    //new radius
    public void setRadius(double newRadius)
        throws InvalidRadiusException {
      if (newRadius >= 0)
         radius = newRadius;
      else
        throw new InvalidRadiusException(newRadius);
    }
    public static int getNumberOfObjects() {
        return numberOfObjects:

    }
    public double findArea() {
        return radius * radius * 3.14159;

    
    }
    // construct exception
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    // return
    public double getRadius(){
        return radius;
    }
}
}
