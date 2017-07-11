/**
 * Created by jenny on 7/10/2017.
 */
public class TheJets extends Player {

    //Generate and return a Roshambo value:
    @Override
    public Roshambo generateRoshambo() {
        //Always select rock:
        return Roshambo.ROCK;
    }

}
