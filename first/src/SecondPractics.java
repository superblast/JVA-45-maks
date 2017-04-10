/**
 * Created by red6 on 4/4/2017.
 */
public class SecondPractics {
    public static void main(String[] args) {
        double input_double = -.1234567;
        int delimeter_pos = (input_double + "").indexOf('.');
//        System.out.println("whole: " + string_from_dbl.substring(0, delimeter_pos) +
//                ", fract: " + string_from_dbl.substring(delimeter_pos+1, string_from_dbl.length()));
        String wole = (input_double + "").substring(0, delimeter_pos);
        String fract = (input_double + "").substring(delimeter_pos + 1);
        System.out.println("Whole is: " + wole + ", fract is: " + fract);
    }
}
