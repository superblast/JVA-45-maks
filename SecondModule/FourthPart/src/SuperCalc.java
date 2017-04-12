/**
 * Created by red6 on 4/12/2017.
 */
public class SuperCalc extends Calc {
    int a;
    int b;

    public int calculate (int a, int b) {
        return super.calculate(a, b) *2;
    }

}
