package adam.zoo.com;

public class Tiger extends Animal {
    static int numOfTiger = 0;

    // Constructor
    public Tiger(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfTiger++;
    }
}
