package ex4;
public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle();
        kettle.Show();
        kettle.Sound();
        kettle.Desc();

        System.out.println();
        Microwave microwave = new Microwave();
        microwave.Show();
        microwave.Sound();
        microwave.Desc();

        System.out.println();
        Car car = new Car();
        car.Show();
        car.Sound();
        car.Desc();

        System.out.println();
        Ship ship = new Ship();
        ship.Show();
        ship.Sound();
        ship.Desc();
    }
}
