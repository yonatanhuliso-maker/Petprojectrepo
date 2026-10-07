import java.util.Scanner;
// Yonatan Huliso
// Octorber 7, 2026
// This program will determine a person's perfect pet 
// based on their favorite color, season, and name. 
// This program will also use Scanner to get user input
// and validate all inputs so that unexpected values 
// don't cause the program to crash. 

public class PerfectPetSelector {

    public static void main(string[] args){

        Scanner input = new Scanner(System.in);

        String color;
        String season;
        String name; 

        //make sure to get a valid color
        while(true){
            System.out.print("Enter your favorite color (red, blue or green): ");
            color = input.nextLine().trim().toLowerCase();

            if (color.equals("red") || color.equals("blue") ||
                color.equals("green")){
                    break;
                }

            System.out.println("Not a real color. Please enter red, blue, or green.");
        }

        //get a valid season
        while(true){
            System.out("Enter your favorite season (winter, 
            spring, summer, or fall):");
            season = input.nextLine().trim().toLowerCase();

            if (season.equals("winter") ||
                season.equals("spring") ||
                season.equals("summer") ||
                season.equals("fall")) {
                break;
                }
            System.out.println("Not a season. Please enter a valid one.");
        }

        //get a valid name and make sure it only contains letters and spaces. 
        while(true){
            System.out.print("Enter your name: ");
            name = input.nextLine().trim();

            if (isValidName(name)){
                break;
            }
            System.out.println("Invalid name. Please enter 
            a name using letters and spaces only.");
        }

        }


        }
}
