// aV 10/3/24
// zooVersion01.java
//

package adam.zoo.com;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to my Zoo Program!");
        // Create the animal name lists.
        // Call Utilities to get the animal name lists
        String filePath = "C:/Users/yourm/JavaCodes/Zookeeper's Challenge/animalNames.txt";
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // Access the hyena names list
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();

        // Use a for-each loop to output each hyena name
        System.out.println("Hyena Names:");
        for (String hyenaName : listOfHyenaNames) {
            System.out.println(hyenaName);
        }

        // Similarly, you can do this for the other animal lists
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        System.out.println("\nLion Names:");
        for (String lionName : listOfLionNames) {
            System.out.println(lionName);
        }

        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        System.out.println("\nTiger Names:");
        for (String tigerName : listOfTigerNames) {
            System.out.println(tigerName);
        }

        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
        System.out.println("\nBear Names:");
        for (String bearName : listOfBearNames) {
            System.out.println(bearName);
        }

        System.out.println();

        BufferedReader reader = null;

        try {
            // Create a BufferedReader to read the file
            reader = new BufferedReader(new FileReader("C:\\Users\\yourm\\Downloads\\arrivingAnimals.txt"));
            String line;
            // Read each line of the file until reaching the end
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
                // Parse this line of text.
                String[] arrayOfStrPartsOnComma = line.split(", ");
                // output the array elements
                // this is a for : each loop - very handy when examining array elements.

                for (String thePart : arrayOfStrPartsOnComma) {
//                    System.out.println("arrayOfStrPartsOnComma is: " + thePart);
                }
                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
                for (String thePart : arrayOfStrPartsOnSpace) {
//                    System.out.println("arrayOfStrPartsOnSpace is: " + thePart);
                }

                String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                for (String thePart : arrayOfStrPartsOnSpace02) {
//                    System.out.println("arrayOfStrPartsOnSpace02 is: " + thePart);
                }

                int animalAge = Integer.parseInt(arrayOfStrPartsOnSpace[0]);
                String animalWeight = arrayOfStrPartsOnComma[3];
                String animalSpecies = arrayOfStrPartsOnSpace[4];
                String animalSex = arrayOfStrPartsOnSpace[3];
                String animalColor = arrayOfStrPartsOnComma[2];
                String animalOrigin01 = arrayOfStrPartsOnComma[4];
                String animalOrigin02 = arrayOfStrPartsOnComma[5];
                String animalBirthSeason = arrayOfStrPartsOnSpace02[2];

                // Create the right animal object for this arriving animal.
                if(animalSpecies.equals("hyena")) {
                    System.out.println("The animal is a Hyena");
                    // Create a hyena object and attach to the hyena ArrayList
                    Hyena hyena = new Hyena(animalSex, animalAge, 99, "To Be Named",
                            "Animal ID", "Animal Birthdate", animalColor, animalOrigin01 + animalOrigin02);
                    System.out.println("| Age: " + hyena.getAge() +
                            " | Animal Species: " + animalSpecies +
                            " | Animal Sex: " + hyena.getSex() +
                            " | Animal Color: " + hyena.getAnimalColor() +
                            " | Animal Weight: " + animalWeight +
                            " | Animal Origin01: " + hyena.getAnimalOrigin() + animalOrigin02);
                }
                else if(animalSpecies.equals("lion")){
                    System.out.println("\nThe animal is a Lion");
                    // Create a hyena object and attach to the hyena ArrayList
                    Lion lion = new Lion(animalSex, animalAge, 99, "To Be Named",
                            "Animal ID", "Animal Birthdate", animalColor, animalOrigin01 + animalOrigin02);
                    System.out.println("| Age: " + lion.getAge() +
                            " | Animal Species: " + animalSpecies +
                            " | Animal Sex: " + lion.getSex() +
                            " | Animal Color: " + lion.getAnimalColor() +
                            " | Animal Weight: " + animalWeight +
                            " | Animal Origin01: " + lion.getAnimalOrigin() + animalOrigin02);
                }

                // this is a unit test - we are testing the Animal constructor we just created

//                // Prove it!
//                System.out.println("\nthis is the new Hyena animal!\n");
//                System.out.println("\nThe animal is a [" + animalType + "] " + "Animal Age: " + animalAge + " It's birth season is: " + animalBirthSeason + " on " + Utilities.calcAnimalBirthDate(Integer.parseInt(animalAge), animalBirthSeason) + "\n");

//                System.out.println("| Age: " + animalAge +
//                        " | Animal Species: " + animalSpecies +
//                        " | Animal Sex: " + animalSex +
//                        " | Animal Color: " + animalColor +
//                        " | Animal Weight: " + animalWeight +
//                        " | Animal Origin01: " + animalOrigin01);


//                System.out.println("animal birthdate is: " + calcAnimalBirthDate(Integer.parseInt(ageInYears), animalBirthSeason));

            }
        } catch (IOException e) {
            // Handle exceptions, such as file not found or I/O errors
            e.printStackTrace();
        } finally {
            // Close the BufferedReader in the finally block to ensure it gets closed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println();
        System.out.println("The amount of Hyena in the zoo is: [" + Hyena.numOfHyenas + "]");
        System.out.println("The amount of Lion in the zoo is: [" + Lion.numOfLions + "]");

    }
}
