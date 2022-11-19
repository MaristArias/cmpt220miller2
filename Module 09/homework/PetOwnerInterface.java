package Module 09.homework;


public class PetOwnerInterface extends PetInterface {
    {
        private String name;
        private int age;
    }
    public PetOwnerInterface(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public PetInterface buyPet(PetInterface animal)
    {
        return animal;
    }
}
