package Module 09.homework;

public class PetOwnerInterfaceTester extends PetInterface {
    public static void main (String[] args)
    {
        PetOwnerInterface petownint = new PetOwnerInterface ("Nick Bratt", 23);
        DogInterface dogint = new DogInterface ("Aurora Violet", 19);
        CatInterface catint = new CatInterface ("Jordyn Smith", 27);

        PetOwnerInterface petint1 = petownint.buyPet(dogint); //buy dog
        PetOwnerInterface petint2 = petownint.buyPet(catint); //buy cat

        petint1.speak();
        petint2.speak();
    }
}
