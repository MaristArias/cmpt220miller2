public class CargoShip extends Container {
    private int cargoshipNo;

public CargoShip(int containerNo, double weight, String contents){
    this.containerNo = containerNo;
    this.weight = weight;
    this.contents = contents;
}
public int getcontainerNo(){
return containerNo;
}
public double getWeight(){
    return weight;
}
public String getContents(){
    return contents;
}
public void setCargoshipNo(){
    return cargoshipNo;
}
public void setCargoshipNo(int cargoshipNo){
    this. cargoshipNo = cargoshipNo;
}
}
