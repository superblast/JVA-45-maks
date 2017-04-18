package tv;

/**
 * Created by red6 on 4/18/2017.
 */
public class TeleDemo {
    public static void main(String[] args) {
        System.out.println("tv.Televizor program starts");
        Televizor televizor = new Televizor(false, 1);
        Pult pult = new Pult();
        pult.setUpOnOffButton();
        pult.pressOn();
        pult.pressOff();

        pult.setUpChannelsButtons();
    }
}
