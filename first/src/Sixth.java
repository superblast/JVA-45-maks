import java.util.Arrays;

/**
 * Created by red6 on 4/6/2017.
 */
public class Sixth {
    public static void main(String[] args) {
//        int [] numbers = {0, 1, 2, 3, 4, 5};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        ------------- Print every 3 elements of array -------------
//        String [] battleField = {" |", "A ", "B ", "-|", "--", "--", "1|", "B ", "B "};
//        for (int i = 0; i < battleField.length; i= i + 3) {
//            System.out.println(battleField[i] + battleField[i + 1] + battleField[i + 2]);
//        }
//        ------------- FOR EACH JAVA EXAMPLE ---------------------
        String [] battleField = {" |", "A ", "B ", "-|", "--", "--", "1|", "B ", "B "};
        int ind = 0;
        String sOut = "";
        for (String s: battleField) {
            sOut = sOut + s;
            ind++;
            if (ind % 3 == 0) {
                System.out.println(sOut);
                sOut = "";
            }
        }
    }
}
