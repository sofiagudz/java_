package practice;

public class Triangle {
    public int a;
    public int b;
    public int c;
    public int height_a;
    public int height_b;
    public int height_c;
    public double sin_ab;

    public Triangle() {
    }

    public Triangle(int a, int b, int c, int height_a, int height_b, int height_c, double sin_ab) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height_a = height_a;
        this.height_b = height_b;
        this.height_c = height_c;
        this.sin_ab = sin_ab;
    }
}
