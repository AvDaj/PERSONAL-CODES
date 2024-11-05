package adam.zoo.com;
import java.util.Date;

public class Animal {
    static int numOfAnimal = 0;


    public Animal(){
        numOfAnimal++;
    }

    // Create a constructor that will accept all fields as arguments.
    public Animal(String sex, int age, int weight, String animalName,
                  String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        numOfAnimal++;
    }

    // Create all attributes (fields) needed for our midterm program
    private String sex;
    private int age = 0;
    private int weight = 0;
    private String animalID;
    private String animalName;
    private String animalBirthdate;
    private String animalColor;
    private String animalOrigin;
    private Date animalArrivalDate;

    // Create getters and setters
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID() {
        return animalID;
    }
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName(){
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalBirthday() {
        return animalBirthdate;
    }
    public void setAnimalBirthday(Date animalBirthday) {
        this.animalBirthdate = String.valueOf(animalBirthday);
    }

    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor){
        this.animalColor = animalColor;
    }

    public String getAnimalOrigin() {
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }

    public Date getAnimalArrivalDate() {
        return animalArrivalDate;
    }
    public void setAnimalArrivalDate(Date animalArrivalDate) {
        this.animalArrivalDate = animalArrivalDate;
    }

}