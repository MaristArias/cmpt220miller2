//package Module 09.homework;

public class PetOwnerInterfaceTester {
    public static void main (String[] args)
    {
        PetOwnerInterface petownint = new PetOwnerInterface ("Nick Bratt", 23);
        DogInterface dogint = new DogInterface ("Aurora Violet", 19);
        CatInterface catint = new CatInterface ("Jordyn Smith", 27);

        PetInterface petint1 = petownint.buyPet(dogint); //buy dog
        PetInterface petint2 = petownint.buyPet(catint); //buy cat

        petint1.speak();
        petint2.speak();
    }
}
