package practice;

public class Area {
    private Area() {
    }
    public static double triangle_Height(Triangle triangle){
        return 0.5 * triangle.a * triangle.height_a;
    }
    public  static double triangle_Sin(Triangle triangle){
        return 0.5 * triangle.a * triangle.b * triangle.sin_ab;
    }
    public static double triangle_Herona(Triangle triangle){
        double p = (triangle.a + triangle.b + triangle.c)/2;
        double area = Math.sqrt(p*(p-triangle.a)*(p-triangle.b)*(p-triangle.c));
        return area;
    }
    public static int rectangle(Rectangle rectangle){
        return rectangle.a * rectangle.b;
    }
}
