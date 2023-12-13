package ex1;
public class Sailor extends Human{
    public int numberOfWorkMonths;
    public String awards;
    public String languageSkills;
    public String degree;

    public Sailor(String name, int age, String nationality, String city, String phoneNumber, int numberOfWorkMonths, String awards, String languageSkills, String degree) {
        super(name, age, nationality, city, phoneNumber);
        this.numberOfWorkMonths = numberOfWorkMonths;
        this.awards = awards;
        this.languageSkills = languageSkills;
        this.degree = degree;
    }
    @Override
    public String job(){
        return "I'm a sailor.";
    }

    @Override
    public String toString() {
        return "Number of work months - " + numberOfWorkMonths + "\nAwards - " + awards +
                "\nLanguage skills - " + languageSkills + "\nDegree - " + degree + "\nName - " + name +
                "\nAge - " + age + "\nNationality - " + nationality + "\nCity - " + city +
                "\nPhone number - " + phoneNumber;
    }

    public int getNumberOfWorkMonths() {
        return numberOfWorkMonths;
    }

    public String getAwards() {
        return awards;
    }

    public String getLanguageSkills() {
        return languageSkills;
    }

    public String getDegree() {
        return degree;
    }

    public void setNumberOfWorkMonths(int numberOfWorkMonths) {
        this.numberOfWorkMonths = numberOfWorkMonths;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public void setLanguageSkills(String languageSkills) {
        this.languageSkills = languageSkills;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
