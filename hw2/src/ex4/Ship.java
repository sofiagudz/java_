package ex4;

public class Ship extends Device{
    public String length;
    public String width;
    public String height;
    public String power;
    public Ship() {
        super("Ship");
        this.length = "15.7 m";
        this.width = "4.2 m";
        this.height = "2.1 m";
        this.power = "8830 kWt";
    }

    @Override
    public String toString() {
        return "Ship{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of a ship>>");
    }
    public void Show(){
        System.out.println("Ship");
    }
    public void Desc(){
        System.out.println(toString());
    }
}
