import java.util.HashMap;

/**
 * Created by jenny on 7/10/2017.
 */
public class User extends Player {

    //Generate and return a Roshambo value
    @Override
    public Roshambo generateRoshambo() {

        String selection;

        selection = Validator.getString(entry, "\nRock, paper, or scissors? (R/P/S): ", "Please enter \"r\", \"s\", or \"p\". ", "r", "p", "s").toLowerCase();

        HashMap<String, Roshambo> selectionOptions = new HashMap<String, Roshambo>();

        selectionOptions.put("r", Roshambo.rock);
        selectionOptions.put("p", Roshambo.paper);
        selectionOptions.put("s", Roshambo.scissors);

        return selectionOptions.get(selection);
    }

}
