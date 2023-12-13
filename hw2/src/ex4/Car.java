package ex4;

public class Car extends Device{
    public String brand;
    public String model;
    public String engine;
    public String fuel;
    public String wheelDrive;
    public String gearbox;
    public String color;
    public int numberOfSeats;

    public Car() {
        super("Auto");
        this.brand = "Mercedes";
        this.model = "CLA-Class 200 MHEV 7G-DCT";
        this.engine = "1.3 l";
        this.fuel = "gasoline";
        this.wheelDrive = "front-wheel";
        this.gearbox = "automatic";
        this.color = "white";
        this.numberOfSeats = 5;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", wheelDrive='" + wheelDrive + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of a car>>");
    }
    public void Show(){
        System.out.println("Car");
    }
    public void Desc(){
        System.out.println(toString());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public String getWheelDrive() {
        return wheelDrive;
    }

    public String getGearbox() {
        return gearbox;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
