/**
 * Created by jenny on 7/10/2017.
 */
public abstract class Player {

    private String name;
    private Roshambo selection;

    //Get user name:
    public String getName() {
        return name;
    }

    //Set user name:
    public void setName(String name) {
        this.name = name;
    }

    //Get Roshambo selection:
    public Roshambo getSelection() {
        return selection;
    }

    //Allow inheriting classes to generate and return a Roshambo value:
    public abstract Roshambo generateRoshambo();

}
