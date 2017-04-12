/**
 * Created by red6 on 4/12/2017.
 */
public class Parallel extends Figures {
    int numberOfSides;

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
    public String printAll() {
        return "For " + super.getName() + " number of sides is " + numberOfSides;
    }
}
