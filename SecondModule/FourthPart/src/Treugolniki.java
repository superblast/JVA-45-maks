/**
 * Created by red6 on 4/12/2017.
 */
public class Treugolniki extends Figures {
     boolean kvadtarniy;
     boolean pravilniy;

    public boolean isKvadtarniy() {
        return kvadtarniy;
    }

    public boolean isPravilniy() {
        return pravilniy;
    }

    public void setTreugolnikParams(boolean kvadtarniy, boolean pravilniy) {
        this.kvadtarniy = kvadtarniy;
        this.pravilniy = pravilniy;
    }
    public String printAll() {
        return super.getName() + " is it kvadtarniy = " + kvadtarniy + ", Is it pravilniy = " + pravilniy;
    }
}
