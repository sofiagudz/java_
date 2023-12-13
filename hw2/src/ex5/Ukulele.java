package ex5;

public class Ukulele extends MusicalInstrument{
    public String form;
    public String body;
    public String strings;

    public Ukulele() {
        super("Ukulele");
        this.form = "looks like a small guitar with four strings, although there are other variations (for example, a ukulele with 6 strings - a tenor guitar ukulele)";
        this.body = "The body of the ukulele is made of wood such as mahogany, cedar, or other species. It can have different shapes, from the classic offset bowl to \na more rectangular shape.";
        this.strings = "four strings that are often tuned to the key G-C-E-A (low to high)";
    }

    @Override
    public String toString() {
        return "Ukulele{" +
                "form='" + form + '\'' +
                ", \nbody='" + body + '\'' +
                ",\nstrings='" + strings + '\'' +
                '}';
    }
    public void Sound(){
        System.out.println("<<a sound of an ukulele>>");
    }
    public void Show(){
        System.out.println(getName());
    }
    public void Desc(){
        System.out.println(toString());
    }
    public void History(){
        System.out.println("The ukulele has a charming history that traces back to the 19th century in the Hawaiian Islands. \n" +
                "Its roots can be linked to Portuguese immigrants who brought a small guitar-like instrument called the machete to \n" +
                "Hawaii in the late 1800s.");
    }

    public String getForm() {
        return form;
    }

    public String getBody() {
        return body;
    }

    public String getStrings() {
        return strings;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }
}
