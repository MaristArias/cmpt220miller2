//package Module 09.homework;

public class PetOwner{
    private String name;
    private int age;
    public PetOwner(){

    }
    // name and age
    public PetOwner(String name, int age) {
        this.name = name;
        this.age = age;

    }
    // return name and age
    public String GetName() {
        return name;
    }
    public int getAge(){
        return age;
 
    }
<<<<<<< HEAD
    // buy cat or dog
    public Pet buyPet(String name, int age, String breed) {
=======
    public Pet buyPet(String name, int age, String type) {
>>>>>>> 5e0f47ffde6b638fe627d492714303f45f002099
        Pet buyPet = null;
        if (type.equals("Cat"))
        {
            buyPet = new Cat(name, age);
        }
        else if (type.equals("Dog"))
        {
            buyPet = new Dog(name, age);
        }
        return buyPet;
    }
}
