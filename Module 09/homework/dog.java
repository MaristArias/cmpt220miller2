//package Module 09.homework;

public class Dog extends Pet {
    public Dog() {

    }
    public Dog(String name, int age) {
        super(name,age);
    }
    public void speak(){
        System.out.println("Woof! My name is " + getname() + ", my age is " + getage());

    }
}
