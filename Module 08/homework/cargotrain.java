public class CargoTrain extends Container {
    private int cargotrainNo;

    public CargoTrain(int containerNo, double weight, String contents) {
        this.containerNo = containerNo;
        this.weight = weight;
        this.contents = contents;
    }

    public int getcontainerNo() {
        return containerNo;
    }

    public double getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }

    public void setCargotrainNo() {
        return cargotrainNo;
    }

    public void setCargotrainNo(int cargotrainNo) {
        this.cargotrainNo = cargotrainNo;
    }
}
