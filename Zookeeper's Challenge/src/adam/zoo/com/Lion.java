package adam.zoo.com;

public class Lion extends adam.zoo.com.Animal {
    static int numOfLions = 0;

    public Lion(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfLions++;
    }

}
