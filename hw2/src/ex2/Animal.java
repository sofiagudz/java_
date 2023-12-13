package ex2;
public class Animal {
    public String name;
    public int age;
    public String color;
    public String country;
    public String weight;
    public String habitat;
    public String diet;
    public String lifespan;

    public Animal() {
    }

    public Animal(String name, int age, String color, String country, String weight, String habitat, String diet, String lifespan) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.country = country;
        this.weight = weight;
        this.habitat = habitat;
        this.diet = diet;
        this.lifespan = lifespan;
    }

    public void eat(){}
    public void run(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }
}
