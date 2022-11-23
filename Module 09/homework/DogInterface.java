//package Module 09.homework;

public class DogInterface implements PetInterface {
    private String name;
    private int age;

    public DogInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

}
