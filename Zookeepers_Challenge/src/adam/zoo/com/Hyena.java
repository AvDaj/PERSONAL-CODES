package adam.zoo.com;

public class Hyena extends Animal {
    static int numOfHyenas = 0;

    // Constructor
    public Hyena(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfHyenas++;
    }
}
