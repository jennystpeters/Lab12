import java.util.Scanner;

/**
 * Created by jenny on 7/10/2017.
 */
public abstract class Player {

    Scanner entry = new Scanner(System.in);

    private String name;
    private Roshambo selection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roshambo getSelection() {
        return selection;
    }

    public abstract Roshambo generateRoshambo();

}
