/**
 * Created by red6 on 4/13/2017.
 */
public class FlyerDemo {
    public static void main(String[] args) {
        Flyer[] flyers = new Flyer[3];
        flyers[0] = new Superman();
        flyers[0].fly();
        flyers[1] = new Superman();

        new Superman() {
            @Override
            public void fly() {
                super.fly();
            }
        };

        Flyer overrydedFlyer = new Flyer() {
            @Override
            public void fly() {
                System.out.println("Anonimous flyer");
            }
        };
//        Difference in ovverided by inner class and normal class behaviour
        flyers[1].fly();
        overrydedFlyer.fly();
    }
}

