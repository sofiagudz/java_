package ex2;

public class Tiger extends Animal{
    public Tiger() {
        super("Tiger", 6, "orange with black stripes", "Northwestern China", "90-310kg",
                "rain forests, grasslands, savannas and even mangrove swamps",
                "large ungulates, such as wild boar and deer, but are also known to consume monkeys, buffalo, sloth bears, leopards and even crocodiles",
                "10-15 years");
    }

    public void hunt(){}

    @Override
    public String toString() {
        return "Tiger{" +
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
