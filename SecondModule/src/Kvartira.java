/**
 * Created by red6 on 4/10/2017.
 */
public class Kvartira {
    private int roomTemperature = 24;
    private String whatToCook = "Borsch";

    public Kvartira() {
//        to set kvarira parameters use set, get methods
        this.roomTemperature = roomTemperature;
        this.whatToCook = whatToCook;
    }

    public int getRoomTemperature() {
        return roomTemperature;
    }

    public String getWhatToCook() {
        return whatToCook;
    }

    public void setRoomTemperature(int roomTemperatureToSet) {
        this.roomTemperature = roomTemperatureToSet;
        System.out.println("Appartment successfully colled to temperature " + roomTemperatureToSet);
    }

    public void setWhat(String whatToCookToSet) {
        this.whatToCook = whatToCookToSet;
    }



//    static void conditioning() {
//        if (AirConditionerInst.condOn(roomTemperature, 18) != 18) {
//            System.out.println("Conditioner is Broked, temperature still " + roomTemperature);
//        }
//    }
}
