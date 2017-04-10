/**
 * Created by red6 on 4/10/2017.
 */
public class KvartiraDemo {
//    -----------------------JAVA BEANS DEMO-----------------------

    public static void main(String[] args) {
        Kvartira kvar1 = new Kvartira();

        System.out.println("Welcome to our Appartments, temperature is " + kvar1.getRoomTemperature());

        AirConditioner airKond1 = new AirConditioner();

        airKond1.condOn(kvar1.getRoomTemperature(), 18);
        kvar1.setRoomTemperature(airKond1.conditionedRoomTemperature);

        //        TODO: prepare Borcsh, cool appartment
//        GIT comm - delete me

//        AirConditionerInst = new AirConditioner();
//        CoockingTableInst = new CoockingTable();
//
//        System.out.println("Welcome to our Appartments, temperature is " + roomTemperature);
//        conditioning ();
//        System.out.println("We cooled appartment, temperature is " + roomTemperature);
//
//        System.out.println(CoockingTableInst.coocking(what) + " temperature is " + roomTemperature);
//        conditioning ();
//        System.out.println("We cooled appartment, temperature is " + roomTemperature);
    }

}
