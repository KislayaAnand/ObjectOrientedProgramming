package inheritance.MultiLevel;

public class Dog extends PetAnimal{
    private final String name;
    private final String gender;
    public Dog(String breed, int age, int lifeSpan, String type, String adaptation, String name, String gender) {
        super(breed, age, lifeSpan, type, adaptation);
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getInfo() {
        return "Name: "+getName()+"\n"+
                "Gender: "+getGender()+"\n"+
                getDetails();
    }
}
