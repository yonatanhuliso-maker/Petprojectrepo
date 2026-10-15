// Yonatan Huliso
// Octorber 7, 2026
// This program will determine a person's perfect pet 
// based on their favorite color, season, and name. 
// This program will also use Scanner to get user input
// and validate all inputs so that unexpected values 
// don't cause the program to crash. 

import java.util.Scanner;

public class PetSelector {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String color;
        String season;
        String name; 

        //making sure to get a valid color
        while(true){
            System.out.print("Enter your favorite color (red, blue or green): ");
            color = input.nextLine().trim().toLowerCase();

            if (color.equals("red") || color.equals("blue") || color.equals("green")){
                    break;
                }

            System.out.println("Not a real color. Please enter red, blue, or green.");
        }

        //getting a valid season
        while(true){
            System.out.println("Enter your favorite season (winter, spring, summer, or fall):");
            season = input.nextLine().trim().toLowerCase();

            if (season.equals("winter") || season.equals("spring") || season.equals("summer") || season.equals("fall")) {
                break;
                }
            System.out.println("Not a season. Please enter a valid one.");
        }

        //getting a valid name and make sure it only contains letters and spaces 
        while(true){
            System.out.print("Enter your name: ");
            name = input.nextLine().trim();

             if (name.length() > 0 && "abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0) {
                break;
                //this is a letter 
                } 
                

            
            System.out.println("Invalid name. Please enter a name using letters and spaces only.");
        }
        //getting the first letter of the name
        String firstLetter = name.substring(0, 1).toLowerCase();

        boolean vowel = "aeiou".indexOf(firstLetter) >= 0;
        boolean consonant = "abcdefghijklmnopqrstuvwxyz".indexOf(firstLetter) >= 0 && !vowel;

        //getting the perfect pet
        String pet = "";

        if (color.equals("red")) {
            if (vowel) {
                pet = "Porcupine";
            } else {
                pet = "Panda";
            }
        } else if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        } else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
        } else if (color.equals("green") && consonant && season.equals("winter")) {
            pet = "Giraffe";
        } else if (color.equals("green") && !season.equals("fall")) {
            pet = "Dog";
        } else if (season.equals("summer")) {
            pet = "Pony";
        } else if (color.equals("blue") && consonant
                && !season.equals("summer") && !season.equals("fall")) {
            pet = "Axolotl";
        } else {
            pet = "Pet Rock";
        }

        System.out.println("Your perfect pet is: " + pet);

    }
}

