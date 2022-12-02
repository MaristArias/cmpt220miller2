//package Module 09.homework;


public class PetOwnerInterface {
    private String name;
    private int age;
    
    public PetOwnerInterface(){

    }

    public PetOwnerInterface(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    // get name and age
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public PetInterface buyPet(PetInterface petint)
    {
        return petint;
    }
}
