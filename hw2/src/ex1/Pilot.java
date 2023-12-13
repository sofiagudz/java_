package ex1;
public class Pilot extends Human{
    public String englishLevel;
    public int numberOfOutput;
    public String fitnessLevel;

    public Pilot(String name, int age, String nationality, String city, String phoneNumber, String englishLevel, int numberOfOutput, String fitnessLevel) {
        super(name, age, nationality, city, phoneNumber);
        this.englishLevel = englishLevel;
        this.numberOfOutput = numberOfOutput;
        this.fitnessLevel = fitnessLevel;
    }
    @Override
    public String job(){
        return "I'm a pilot.";
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "englishLevel='" + englishLevel + '\'' +
                ", numberOfOutput=" + numberOfOutput +
                ", fitnessLevel='" + fitnessLevel + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public int getNumberOfOutput() {
        return numberOfOutput;
    }

    public String getFitnessLevel() {
        return fitnessLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public void setNumberOfOutput(int numberOfOutput) {
        this.numberOfOutput = numberOfOutput;
    }

    public void setFitnessLevel(String fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }
}
