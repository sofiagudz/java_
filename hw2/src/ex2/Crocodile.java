package ex2;

public class Crocodile extends Animal{
    public Crocodile() {
        super("Crocodile", 12, "lighter, olive, green or brown", "Africa, Southeast Asia, The Americas", "200-1100 kg",
                "brackish or saltwater areas", "fish, insects, small frogs, lizards, crustaceans and small mammals",
                "70 years");
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", \ncountry='" + country + '\'' +
                ", weight='" + weight + '\'' +
                ", habitat='" + habitat + '\'' +
                ", \ndiet='" + diet + '\'' +
                ", lifespan='" + lifespan + '\'' +
                '}';
    }

    public void hunt(){}
    public void swim(){}
}
