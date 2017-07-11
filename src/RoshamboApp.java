/**
 * Created by jenny on 7/10/2017.
 */
public class RoshamboApp {

    //Validate user input:
    private static Validator Validator = new Validator();

    public static void main(String[] args) {

        String keepGoing = "y";
        String playerSelected;
        String opponent = null;
        Roshambo userSelection;
        Roshambo opponentSelection;

        //Array to tally score and print final results:
        //tally[0][0] - User Wins / tally[0][1] - User Losses / tally[1][0] - Opponent Wins / tally[1][1] - Opponent Losses
        int[][] tally = new int[2][2];

        //Create instance of each player:
        User user = new User();
        TheJets jet = new TheJets();
        TheSharks shark = new TheSharks();

        System.out.println("Welcome to ROCK PAPER SCISSORS!");

        //Set user name:
        user.setName(Validator.getString("\nEnter your name: "));

        //Select opponent - TheJets or TheSharks:
        playerSelected = Validator.getString("\nWould you like to play against TheJets or TheSharks: ", "Sorry, entry must be \"j\" or \"s\". ", "j", "s");

        //Continue as long as user enters "y" or "Y":
        while (keepGoing.equalsIgnoreCase("y")) {

            //Get user's selection of rock, paper, or scissors:
            userSelection = user.generateRoshambo();
            System.out.println("\n" + user.getName() + ": " + userSelection);

            if (playerSelected.equalsIgnoreCase("j")) {
                opponent = "TheJets";
                //TheJets always select rock:
                opponentSelection = jet.generateRoshambo();
                System.out.println(opponent + ": " + opponentSelection);
            } else {
                opponent = "TheSharks";
                //TheSharks randomly select rock, paper, or scissors:
                opponentSelection = shark.generateRoshambo();
                System.out.println(opponent + ": " + opponentSelection);
            }

            //Tally scores for the user and selected opponent:
            tally = result(userSelection, opponentSelection, user.getName(), opponent, tally);

            keepGoing = Validator.getString("\nPlay again? (y/n): ", "Sorry, entry must be \"y\" or \"n\". ", "y", "n");
        }

        //Print final scores to console:
        System.out.println(user.getName() + " won " + tally[0][0] + " and lost " + tally[0][1] + ".");
        System.out.println(opponent + " won " + tally[1][0] + " and lost " + tally[1][1] + ".");

        System.out.println("\nGoodbye");
    }

    //Determine winner of each round and increment score tally:
    public static int[][] result(Roshambo userSelection, Roshambo opponentSelection, String user, String opponent, int tally[][]) {

        if ((opponentSelection.ordinal() == (userSelection.ordinal() + 1)) || (userSelection.ordinal() == (opponentSelection.ordinal() + 2))) {
            System.out.println(opponent + " wins!");
            tally[1][0]++;
            tally[0][1]++;
        } else if ((userSelection.ordinal() == (opponentSelection.ordinal() + 1)) || (opponentSelection.ordinal() == (userSelection.ordinal() + 2))) {
            System.out.println(user + " wins!");
            tally[0][0]++;
            tally[1][1]++;
        } else {
            System.out.println("Draw!");
        }
        return tally;
        //Another approach to determine winner:
        /*if (userSelection != opponentSelection) {
            if (userSelection == Roshambo.ROCK) {
                if (opponentSelection == Roshambo.PAPER) {
                    System.out.println(opponent + " wins!");
                } else {
                    System.out.println(user + " wins!");
                }
            } else if(userSelection == Roshambo.PAPER) {
                if (opponentSelection == Roshambo.ROCK) {
                    System.out.println(user + " wins!");
                } else {
                    System.out.println(opponent + " wins!");
                }
            } else if(userSelection == Roshambo.SCISSORS) {
                if (opponentSelection == Roshambo.ROCK) {
                    System.out.println(opponent + " wins!");
                } else {
                    System.out.println(user + " wins!");
                }
            }
        } else {
            System.out.println("Draw!");
        }*/
    }
}
