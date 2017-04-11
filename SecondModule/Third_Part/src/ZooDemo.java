/**
 * Created by red6 on 4/11/2017.
 */
public class ZooDemo {
    public static void main(String[] args) {
        System.out.println("Zoo welcome");
        Monkey monk1 = new Monkey("FirstName");
        System.out.println();
        System.out.println(monk1.toString());
        System.out.println("---------");

        monk1.setName("Abizana");
        monk1.setFeeded(false);
        monk1.setAngry(false);
        System.out.println("Setted values");
        System.out.println(monk1.toString());

        Monkey monk2 = new Monkey("SecondName");
        Monkey monk3 = new Monkey("ThirdName");

        System.out.println("-----Print all ZOO------");
        printAllAnimals(new Animal[] {monk1, monk2, monk3});
    }

    public static void printAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
        }
}
