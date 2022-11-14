public class Container {
    int containerNo;
    double weight;
    String contents;

    public Container() {}
    
    public Container(int containerNo, double weight, String contents) {
        this.containerNo = containerNo;
        this.weight = weight;
        this.contents = contents;
    }

    public void setContainerNo(int containerNo) {
        this.containerNo = containerNo;
    }

    public int getContainerNo() {
        return containerNo;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return contents;

    }
}
