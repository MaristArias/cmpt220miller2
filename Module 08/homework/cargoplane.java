public class CargoPlane extends Container{
    private int cargoplaneNo;

    public CargoPlane(int containerNo, double weight, String contenString){
        this.containerNo = containerNo;
        this.weight= weight;
        this.contents = contents;
    }
    public int getcontainerNo(){
        return containerNo;
    }
    public double getweight(){
        return weight;
    }
    public String getcontents(){
        return contents;
    }
    public void setcargoPlane(){
        this.cargoplane = cargoplane;
    }

    public int getcargoPlane(){
        return cargoplane;
    }
}
