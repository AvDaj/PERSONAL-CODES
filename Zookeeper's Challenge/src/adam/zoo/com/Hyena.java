package adam.zoo.com;

import java.util.ArrayList;

public class Hyena extends adam.zoo.com.Animal {
    static int numOfHyenas = 0;

    // Constructor
    public Hyena() {
        super();
        numOfHyenas++;
    }

    // Create a constructor that will have all the fields I want.
    public Hyena(String sex, int age, int weight, String animalName,
                  String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfHyenas++;
    }


}
