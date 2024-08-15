package inheritance.MultiLevel;

public class Main {
    public static void main(String[] args) {
        Animal firstDog = new Dog("Pomerian", 5, 15, "Mammal", "Grassland", "Bruno", "Male");

        PetAnimal secondDog = new Dog("Shiztsu", 2, 8, "Mammal", "Grassland", "Melissa", "Female");

        Dog thirdDog = new Dog("German Shephard", 5, 20, "Mammal", "Grassland", "Oscar", "Male");

        System.out.println(((Dog) firstDog).getInfo());
        System.out.println("\n"+secondDog.getDetails());
        System.out.println("\n"+ ((Dog) secondDog).getInfo());

        System.out.println("\n"+ thirdDog.getDetails());
        System.out.println("\n"+ thirdDog.getBreed());
        System.out.println("\n"+ thirdDog.getInfo());
        System.out.println("\n"+ thirdDog.getInfo());
        System.out.println("\n"+ thirdDog.getAdaptation());
    }
}
