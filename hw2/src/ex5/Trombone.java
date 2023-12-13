package ex5;

public class Trombone extends MusicalInstrument{
    public String range;
    public String construction;
    public String tone;

    public Trombone() {
        super("Trombone");
        this.range = "three octaves";
        this.construction = "a brass instrument with a long curved pipe ending in a socket into which a wooden mouthpiece is installed";
        this.tone = "C major";
    }

    @Override
    public String toString() {
        return "Trombone{" +
                "range='" + range + '\'' +
                ", construction='" + construction + '\'' +
                ", tone='" + tone + '\'' +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of a trombone>>");
    }
    public void Show(){
        System.out.println(getName());
    }
    public void Desc(){
        System.out.println(toString());
    }
    public void History(){
        System.out.println("The trombone has a fascinating history that traces back to the Renaissance era in Europe. \n" +
                "Its roots can be found in ancient civilizations' primitive trumpets and horns. However, the modern trombone, \n" +
                "as we know it, began to take shape in the 15th century.");
    }

    public String getRange() {
        return range;
    }

    public String getConstruction() {
        return construction;
    }

    public String getTone() {
        return tone;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}
