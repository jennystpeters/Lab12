import java.util.Random;

/**
 * Created by jenny on 7/10/2017.
 */
public class TheSharks extends Player {

    //Generate and return a Roshambo value
    @Override
    public Roshambo generateRoshambo() {
         int option1 = getMathRandomNumGenerator();
         int option2 = getRandomNumGenerator();
         //return Roshambo.values()[option1];
         return Roshambo.values()[option2];
    }

    //Method using Math Class
    public static int getMathRandomNumGenerator() {
        //Use Math.ceil to prevent zero
        return (int) Math.ceil(Math.random() * 3) ;
    }

    //Method using Random Class
    public static int getRandomNumGenerator() {
        Random randomObject = new Random();
        //Random is zero to number exclusive - add 1 to get to get 1 - 3
        return (randomObject.nextInt(3) + 1);
    }

}
