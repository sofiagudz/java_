package ex1;
public class Human {
    public String name;
    public int age;
    public String nationality;
    public String city;
    public String phoneNumber;

    public Human() {
    }
    public Human(String name, int age, String nationality, String city, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    public String job(){
        return "I'm just a human";
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
