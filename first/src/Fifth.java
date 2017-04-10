import java.util.Arrays;

/**
 * Created by red6 on 4/6/2017.
 */
public class Fifth {
    public static void main(String[] args) {
        int [] data = {1, 2, 3};
        System.out.println(Arrays.toString(data));
        System.out.println("Length: " + data.length);
// -----------Update array value-------------
        setValue(data, 2, 300);
        System.out.println(Arrays.toString(data));
    }

    public static void setValue(int data [], int ArrIndex, int ArrValue) {
        data[ArrIndex] = ArrValue;
    }
}
