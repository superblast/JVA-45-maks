/**
 * Created by red6 on 4/4/2017.
 */
public class SecondProject {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
//        System.out.println(a != b);
//        boolean isEqual = a == b;
        String name = "Oleg";
        String name2 = "Oleg";
//        Faster method to compare references to strings
//        boolean isEqual = name == name2;
//        Slower method
        boolean isEqual = name.equals(name2);
        System.out.println(isEqual);
    }
}
