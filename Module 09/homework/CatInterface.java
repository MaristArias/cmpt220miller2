//package Module 09.homework;

public class CatInterface implements PetInterface {
    private String name;
    private int age;

    public CatInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // message
    public void speak() {
        System.out.println("Meow!");
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
