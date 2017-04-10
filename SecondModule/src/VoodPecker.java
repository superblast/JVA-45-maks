/**
 * Created by red6 on 4/7/2017.
 */
public class VoodPecker {

        String forest = "Sirec";
        double cluveLenght = 1;
        int eggs = 0;
        boolean haveAHole = false;

    public void flightTo(String destination) {
            if (destination != forest) {
                    System.out.println("Flew to " + destination + " from " + forest);
            }
            else {
                    System.out.println("It's my home again");
            }
        }
        public double makeAHole (double currentLenght) {

            if (currentLenght > 0) {
                    currentLenght-=0.3;
                    System.out.println("Made hole in wood, remaining cluve is " + cluveLenght);
                    haveAHole = true;
                }
                else {
                    System.out.println("Mission impossible, wait for cluve groth, now it " + cluveLenght);
                    haveAHole = false;
            }
        cluveLenght = currentLenght;
            return cluveLenght;
        }

        public void readyForEggs () {
            if (haveAHole) {
                    System.out.println("Waiting for pair to make eggs");
            }
            else {
                    System.out.println("No hole, wait for cluve and make or flight away");
            }
        }

        void areYouPretty () {
                System.out.println("Or, yes");
        }

}
