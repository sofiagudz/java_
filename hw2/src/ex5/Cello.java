package ex5;

public class Cello extends MusicalInstrument{
    public String form;
    public String strings;
    public String vulture;

    public Cello() {
        super("Cello");
        this.form = "long curved body, fretted neck and four strings";
        this.strings = "four strings tuned to the notes C-G-D-A (low to high)";
        this.vulture = "allows the musician to produce different notes and chords thanks to the frets located on the fretboard";
    }

    @Override
    public String toString() {
        return "Cello{" +
                "form='" + form + '\'' +
                ", \nstrings='" + strings + '\'' +
                ", \nvulture='" + vulture + '\'' +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of a cello>>");
    }
    public void Show(){
        System.out.println(getName());
    }
    public void Desc(){
        System.out.println(toString());
    }
    public void History(){
        System.out.println("The cello, or violoncello, is a beautiful instrument with a rich history that can be traced back to\n" +
                " the 16th century. It evolved from earlier bowed string instruments, gradually taking shape to become the instrument \n" +
                "we recognize today.");
    }
    public String getForm() {
        return form;
    }

    public String getStrings() {
        return strings;
    }

    public String getVulture() {
        return vulture;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }

    public void setVulture(String vulture) {
        this.vulture = vulture;
    }
}
