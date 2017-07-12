/**
 * Created by jenny on 7/10/2017.
 */
public enum Roshambo {
    //Store ROCK, PAPER, SCISSORS and use toString override to convert selected value to String:
    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    private String stringVersion;

    Roshambo(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    //Override to output Roshambo as string (as declared for stringVersion) instead of reference location:
    @Override
    public String toString() {
        return stringVersion;
    }

}
