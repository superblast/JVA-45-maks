/**
 * Created by red6 on 4/10/2017.
 */
public class AirConditioner {
    public int conditionedRoomTemperature = 10;

    public int condOn (int roomTemperature, int tempearture) {
        System.out.println("Conditioner Switching On");
        System.out.println("-----");

        while (roomTemperature > tempearture) {
            System.out.println("Decreasing temperature from " + roomTemperature);
            roomTemperature = roomTemperature -=1;
            System.out.println("Current temperature is " + roomTemperature);
        }

        System.out.println("Conditioner swithcing off, curr temperature is " + roomTemperature);
        System.out.println("-----------");
//        Incorrect way but nothing to do temporary
        conditionedRoomTemperature = roomTemperature;
        return conditionedRoomTemperature;
    }
}
