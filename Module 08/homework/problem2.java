package Module 08.homework;

public class problem2 {
    public static void main(String[] args) {
        int containerNumber,cargoShipNo,cargoPlaneNo, cargoTrainNo;
        double weight;
        String contents;
        System.out.print("Enter container number: ");
        System.out.print("Enter weight: ");
        System.out.print("Enter contents: ");
        System.out.print("Enter cargo ship number: ");

    CargoShip cargoShip = new 
        CargoShip(containerNumber,weight,contents,cargoShipNo);
        System.out.print("Enter container number: ");
        System.out.print("Enter weight: ");
        System.out.print("Enter contents: ");
        System.out.print("Enter cargo train number: ");

    CargoTrain cargoTrain = new 
        CargoTrain(containerNumber,weight,contents,cargoTrainNo);
        System.out.print("Enter container number: ");
        System.out.print("Enter weight: ");
        System.out.print("Enter contents: ");
        System.out.print("Enter cargo plane number: ");
        CargoPlane cargoPlane = new 

    CargoPlane(containerNumber,weight,contents,cargoPlaneNo);
        System.out.println("This info pertains to cargo ships");
        System.out.println("The container number is "+cargoShip.getContainerNo());
        System.out.println("The container's weight is "+cargoShip.getWeight());
        System.out.println("The container contents are "+cargoShip.getContents());
        System.out.println("the Cargo Ship number is "+cargoShip.getCargoShipNo());

        System.out.println("This info pertains to cargo planes");
        System.out.println("The container number is "+cargoPlane.getContainerNo());
        System.out.println("The container's weight is "+cargoPlane.getWeight());
        System.out.println("The container contents are "+cargoPlane.getContents());
        System.out.println("the Cargo Ship number is "+cargoPlane.getCargoShipNo());

        System.out.println("This info pertains to cargo trains");
        System.out.println("The container number is "+cargoTrains.getContainerNo());
        System.out.println("The container's weight is "+cargoTrains.getWeight());
        System.out.println("The container contents are "+cargoTrains.getContents());
        System.out.println("the Cargo Ship number is "+cargoTrains.getCargoShipNo());
 }
