package ex4;
public class Microwave extends Device{
    public int capacityRange;
    public String type;
    public String color;
    public double depth;
    public double height;
    public double width;
    public String power;
    public String weight;
    public String manufacturerCountry;

    public Microwave() {
        super("Microwave");
        this.capacityRange = 23;
        this.type = "with grill";
        this.color = "silver(grey)";
        this.depth = 39.2;
        this.height = 27.5;
        this.width = 48.9;
        this.power = "2300 Wt";
        this.weight = "13 kg";
        this.manufacturerCountry = "North Korea";
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "capacityRange=" + capacityRange +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", power='" + power + '\'' +
                ", weight='" + weight + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of a microwave>>");
    }
    public void Show(){
        System.out.println("Microwave");
    }
    public void Desc(){
        System.out.println(toString());
    }

    public int getCapacityRange() {
        return capacityRange;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getPower() {
        return power;
    }

    public String getWeight() {
        return weight;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setCapacityRange(int capacityRange) {
        this.capacityRange = capacityRange;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }
}
