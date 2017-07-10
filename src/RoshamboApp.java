import com.sun.scenario.effect.impl.prism.ps.PPSZeroSamplerPeer;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jenny on 7/10/2017.
 */
public class RoshamboApp {

    //Validation of user input:
    private static Validator Validator = new Validator();

//    public Roshambo decideWinner(user) {
//        if (userInput.equals("rock"))
//            return Roshambo.rock
//    }

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        String keepGoing = "y";
        String playerSelected;
        String opposition;
        Roshambo userSelection;
        Roshambo oppositionSelection;

        User user = new User();
        TheJets jet = new TheJets();
        TheSharks shark = new TheSharks();

        System.out.println("Welcome to Rock Paper Scissors!");

        user.setName(Validator.getString(entry, "\nEnter your name: "));

        playerSelected = Validator.getString(entry, "\nWould you like to play against TheJets or TheSharks: ", "Sorry, entry must be \"j\" or \"s\". ", "j", "s");

        while (keepGoing.equalsIgnoreCase("y")) {

            //System.out.println(user.getName() + ": " + selectionOptions.get(selection));
            userSelection = user.generateRoshambo();
            System.out.println("\n" + user.getName() + ": " + userSelection);

            if (playerSelected.equalsIgnoreCase("j")) {
                opposition = "TheJets";
                oppositionSelection = jet.generateRoshambo();
                System.out.println(opposition + ": " + oppositionSelection);
            } else {
                opposition = "TheSharks";
                oppositionSelection = shark.generateRoshambo();
                System.out.println(opposition + ": " + oppositionSelection);
            }

            result(userSelection, oppositionSelection, user.getName(), opposition);

            keepGoing = Validator.getString(entry, "\nPlay again? (y/n): ", "Sorry, entry must be \"y\" or \"n\". ", "y", "n");
        }

        System.out.println("\nGoodbye");
    }

    public static void result(Roshambo userSelection, Roshambo oppositionSelection, String user, String opposition) {

        if (userSelection != oppositionSelection) {
            if (userSelection == Roshambo.rock) {
                if (oppositionSelection == Roshambo.paper) {
                    System.out.println(opposition + " wins!");
                } else {
                    System.out.println(user + " wins!");
                }
            } else if(userSelection == Roshambo.paper) {
                if (oppositionSelection == Roshambo.rock) {
                    System.out.println(user + " wins!");
                } else {
                    System.out.println(opposition + " wins!");
                }
            } else if(userSelection == Roshambo.scissors) {
                if (oppositionSelection == Roshambo.rock) {
                    System.out.println(opposition + " wins!");
                } else {
                    System.out.println(user + " wins!");
                }
            }
        } else {
            System.out.println("Draw!");
        }

//        HashMap<HashMap.Entry<Roshambo, Roshambo>, String> result = new HashMap<HashMap.Entry<Roshambo, Roshambo>, String>();
//
//        result.put(Roshambo.rock, Roshambo.rock>, "Draw!");
//
//        String[][] result = new String[][]{
//                {"rock", "rock", "rock", "paper", "paper", "paper", "scissors", "scissors", "scissors"},
//                {"rock", "paper", "scissors", "rock", "paper", "scissors", "rock", "paper", "scissors"},
//                {"Draw!", opposition + " wins!", user + " wins!", user + " wins!", "Draw!", opposition + " wins!", opposition + " wins!", user + " wins!", "Draw!"}};


    }

}
