package inheritance.MultiLevel;

public class PetAnimal extends Animal {
    private final String type;
    private final String adaptation;
    public PetAnimal(String breed, int age, int lifeSpan, String type, String adaptation) {
        super(breed, age, lifeSpan);
        this.type = type;
        this.adaptation = adaptation;
    }

    public String getType() {
        return this.type;
    }

    public String getAdaptation() {
        return this.adaptation;
    }

    public String getDetails() {
        return "Breed: "+ getBreed()+"\n"+
                "Age: "+getAge()+"\n"+
                "Life Span: "+getLifeSpan()+"\n"+
                "Type: "+getType()+"\n"+
                "Adaptation: "+getAdaptation();
    }
}
