import java.util.Scanner;
import java.util.Random;
public class oddsOrEvens {
    public static void main(String[] args) {
        //Lets play a game
        System.out.println("Lets play a game called \"Odds and Evens\"");
        //whats user name?
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        //greet user and ask to choose odd or even
        System.out.print("Hello " + user + ", which do you choose? (O)dds or (E)vens? ");
        
        String choice;
        do {
            choice = input.nextLine();
            if (choice.equalsIgnoreCase("e")) {
                System.out.println(user + " has picked evens. The computer will be odds!");
            } else if(choice.equalsIgnoreCase("o")){
                System.out.println(user + " has picked odds. The computer will be evens!");
            } else {
                System.out.println("That is not a valid option, Choose (O)odds or (E)vens.");
            }

        } while((!choice.equalsIgnoreCase("e")) && (!choice.equalsIgnoreCase("o")));

        System.out.println("----------------------------------------------------------");


        //play GAME
        System.out.print("How many \"fingers\" do you put out? ");
        Random rand = new Random();
        int computer = rand.nextInt(6);
        int fingers = input.nextInt();

        //tell user how many fingers computer puts out
        System.out.println("The computer puts out " + computer + " \"fingers\".");
        System.out.println("----------------------------------------------------------");

        //determine RESULTS
        int sum = fingers + computer;
        //show the math
        System.out.println(fingers + " + " + computer + " = " + sum);

        //is the sum even or odd?
        boolean oddOrEven = sum % 2 == 0;

        if (sum %2 == 0) {
            System.out.println(sum + " is ....even!");
            if (choice.equalsIgnoreCase("e")){
                System.out.println("That means " + user + " wins!");
            }
            else {
                System.out.println("That means the computer wins!");
            }
        }
        else{
            System.out.println(sum + " is ....odd!");
            if (choice.equalsIgnoreCase("o")){
                System.out.println("That means " + user + " wins!");
            }
            else {
                System.out.println("That means the computer wins!");
            }
        }
        System.out.println("----------------------------------------------------------");
    }
}
