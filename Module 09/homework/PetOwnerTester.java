//import Module.Cat;

public class PetOwnerTester extends PetOwner {
    public static void main (String args[]) {
        PetOwner owner = new PetOwner("olivia",20);
        Pet pet = owner.buyPet("kitty", 2, "Cat");
        pet.speak();
        pet = owner.buyPet("doggy", 3, "Dog");
        pet.speak();
    }
}