import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by red6 on 4/5/2017.
 */
public class Third {
    public static void main(String[] args) {
//        Method overloading sample
//        System.out.println(sum(1, 2));
//        System.out.println(sum(1.333, 2.001));
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//    public static double sum (double a, double b) {
//        return a + b;
        //** ----------------if else statements */
//        String age = "18";
//        int money = 1950;
//
//        if (age != "17" && money >2500) {
//            System.out.println("Age more then 17, current is " + age);
//        }
//        else if (age == "18" && money > 1900) {
//            System.out.println("Age more, Money less");
//        }
        //** ----------------while statements */
//        int counter = 0;
//        String name = null;
//
//        while (counter <= 10) {
//            System.out.println(counter++);
//            if (name != null) {
//                System.out.println("name isn't null");
//                break;
//            }
//            else if (counter > 1&& counter < 5 && name == null ) {
//                System.out.println(" Count is " + counter + ", change name value");
//                name = "Maks" + counter;
//            }
//            else {
//                System.out.println("name is null");
//            }
//        }
        int counter = 0;
        int totalCases = 10;
        while (counter < totalCases) {
            counter++;
            if (counter % 3 == 0) {
                continue;
            }
            System.out.println(counter);
        }
    }
}
