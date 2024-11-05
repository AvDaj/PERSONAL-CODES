package adam.zoo.com;

public class Bear extends Animal {
    static int numOfBear = 0;

    // Constructor
    public Bear(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfBear++;
    }
}
