package ex1;

public class Builder extends Human {
    public String degree;
    public int workExperienceInYears;
    public Builder(String name, int age, String nationality, String city, String phoneNumber, String job, int workExperienceInYears) {
        super(name, age, nationality, city, phoneNumber);
        this.degree = job;
        this.workExperienceInYears = workExperienceInYears;
    }
    @Override
    public String job(){
        return "I'm a builder.";
    }
    @Override
    public String toString() {
        return "Degree - " + degree + "\nWork experience in years - " + workExperienceInYears +
                "\nName - " + name + "\nAge - " + age + "\nNationality - " + nationality +
                "\nCity - " + city + "\nPhone number - " + phoneNumber;
    }
    public String getJob() {
        return degree;
    }

    public int getWorkExperienceInYears() {
        return workExperienceInYears;
    }

    public void setJob(String job) {
        this.degree = job;
    }

    public void setWorkExperienceInYears(int workExperienceInYears) {
        this.workExperienceInYears = workExperienceInYears;
    }
}
