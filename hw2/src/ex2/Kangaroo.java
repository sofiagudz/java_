package ex2;

public class Kangaroo extends Animal{
    public Kangaroo() {
        super("Kangaroo", 5, "red, grey or light to dark brown", "Australia", "38-66 kg", "forests, woodlands, plains, and savannas",
                "grazing and browsing animals", "6-20 years");
    }
    public void jump(){}

    @Override
    public String toString() {
        return "Kangaroo{" +
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
}
