/**
 * Created by jenny on 7/10/2017.
 */
public class TheSharks extends Player {

    //Generate and return a Roshambo value:
    @Override
    public Roshambo generateRoshambo() {
        //Randomly select rock, paper, or scissors:
        return Roshambo.values()[getMathRandomNumGenerator()];
    }

    //Method using Math Class
    public static int getMathRandomNumGenerator() {
        return (int) (Math.random() * 3);
    }
}
