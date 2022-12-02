
public abstract class Pet {
    private String name;
    private int age;

    public Pet() {

    }
    // creating name and age of pet
    public Pet(String name, int age) {
        this.name = name; 
        this.age = age;
    }
    public abstract void speak();
    // get name and age
    public String getname() {
        return name;
    }
    public int getage(){
        return age;
    }
}