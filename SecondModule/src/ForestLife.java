/**
 * Created by red6 on 4/7/2017.
 */
public class ForestLife {
    public static void main(String[] args) {
        VoodPecker vBird = new VoodPecker();
        vBird.cluveLenght = 0.7;


        vBird.makeAHole(vBird.cluveLenght);
        vBird.makeAHole(vBird.cluveLenght);
        vBird.makeAHole(vBird.cluveLenght);
        vBird.makeAHole(vBird.cluveLenght);
        vBird.makeAHole(vBird.cluveLenght);
        vBird.makeAHole(vBird.cluveLenght);

        vBird.readyForEggs();
        vBird.areYouPretty();
        vBird.flightTo("Goloseevo");
        vBird.makeAHole(vBird.cluveLenght);
        vBird.makeAHole(vBird.cluveLenght);
        vBird.readyForEggs();
    }


}
