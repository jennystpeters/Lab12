import java.util.HashMap;

/**
 * Created by jenny on 7/10/2017.
 */
public class User extends Player {

    //Generate and return a Roshambo value:
    @Override
    public Roshambo generateRoshambo() {

        //Get user selection of rock, paper, or scissors:
        String selection = Validator.getString("\nRock, paper, or scissors? (R/P/S): ", "Please enter \"r\", \"s\", or \"p\". ", "r", "p", "s").toLowerCase();

        //Convert input (key) to Roshambo (value):
        HashMap<String, Roshambo> selectionOptions = new HashMap<String, Roshambo>();

        selectionOptions.put("r", Roshambo.ROCK);
        selectionOptions.put("p", Roshambo.PAPER);
        selectionOptions.put("s", Roshambo.SCISSORS);

        return selectionOptions.get(selection);
    }

}
