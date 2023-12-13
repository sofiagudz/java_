package ex4;
public class Kettle extends Device{
    public double capacity;
    public String material;
    public String power;
    public String color;
    public String weight;

    public Kettle() {
        super("Kettle");
        this.capacity = 1.7;
        this.material = "stainless steel, glass";
        this.power = "2200 Вт";
        this.color = "black";
        this.weight = "1.4 kg";
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "capacity=" + capacity +
                ", material='" + material + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void Sound(){
        System.out.println("<<a sound of a kettle>>");
    }
    public void Show(){
        System.out.println("Kettle");
    }
    public void Desc(){
        System.out.println(toString());
    }

    public double getCapacity() {
        return capacity;
    }

    public String getMaterial() {
        return material;
    }

    public String getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
