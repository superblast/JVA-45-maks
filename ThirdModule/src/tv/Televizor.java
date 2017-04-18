package tv;

/**
 * Created by red6 on 4/18/2017.
 */
public class Televizor {
    private boolean status;
    private int channel;

    public Televizor(boolean status, int channel) {
        this.status = status;
        this.channel = channel;
    }

    public boolean isStatus() {
        return status;
    }

    public int getChannel() {
        return channel;
    }
}
