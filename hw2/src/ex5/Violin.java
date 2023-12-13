package ex5;

public class Violin extends MusicalInstrument{
    public double size;
    public double totalLength;
    public double width;

    public Violin() {
        super("Violin");
        this.size = 0.75;
        this.totalLength = 56.5;
        this.width = 19.5;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "size=" + size +
                ", totalLength=" + totalLength +
                ", width=" + width +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of a violin>>");
    }
    public void Show(){
        System.out.println(getName());
    }
    public void Desc(){
        System.out.println(toString());
    }
    public void History(){
        System.out.println("The violin, as we recognize it today, emerged in the early 16th century in Italy, particularly in Cremona. \n" +
                "It evolved from earlier string instruments, gradually taking shape with the craftsmanship of renowned luthiers like Andrea \n" +
                "Amati. His work in the mid-1500s laid the foundation for the modern violin.");
    }

    public double getSize() {
        return size;
    }

    public double getTotalLength() {
        return totalLength;
    }

    public double getWidth() {
        return width;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setTotalLength(double totalLength) {
        this.totalLength = totalLength;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
