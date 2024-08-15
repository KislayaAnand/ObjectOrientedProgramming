package inheritance.MultiLevel;

public class Animal {
    private String breed;
    private int age;
    private int lifeSpan;

    public Animal(String breed, int age, int lifeSpan) {
        this.breed = breed;
        this.age = age;
        this.lifeSpan = lifeSpan;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }
}
