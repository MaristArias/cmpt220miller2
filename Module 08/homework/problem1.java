public class problem1 {
    public static void main(String args[]){}

    Car object1 = new car("car",0,0);
    Train object2 = new Train("train",0,0);
    Airplane object3 = new Airplane("airplane",0,0);
    Ship object4 = new Ship("train",0,0);

    System.out.println("Number of Pass" + object1.getPass());
    System.out.println("Speed" + object1.getSpeed());
    System.out.println("Trav Time" + object1.getTravTime());

    System.out.println("Number of Pass" + object2.getPass());
    System.out.println("Speed" + object2.getSpeed());
    System.out.println("Trav Time" + object2.getTravTime());

    System.out.println("Number of Pass" + object3.getPass());
    System.out.println("Speed" + object3.getSpeed());
    System.out.println("Trav Time" + object3.getTravTime());

    System.out.println("Number of Pass" + object3.getPass());
    System.out.println("Speed" + object3.getSpeed());
    System.out.println("Trav Time" + object3.getTravTime());
}
