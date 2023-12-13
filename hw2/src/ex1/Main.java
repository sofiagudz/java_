package ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("//Builder//");
        Builder builder = new Builder("Sergey", 34, "ukrainian", "Poltava", "0675453376",
                "Kyiv National University of Construction and Architecture", 10);
        System.out.println(builder.job());
        System.out.println(builder.toString());

        System.out.println("\n//Sailor//");
        Sailor sailor = new Sailor("Oleg", 29, "ukrainian", "Odesa", "0984543372",
                3, "none", "english, german",
                "State University of Infrastructure and Technology");
        System.out.println(sailor.job());
        System.out.println(sailor.toString());

        System.out.println("\n//Pilot//");
        Pilot pilot = new Pilot("Oleg", 39, "ukrainian", "Kyiv", "0984509671",
                "C1", 14, "good");
        System.out.println(pilot.job());
        System.out.println(pilot.toString());
    }
}
