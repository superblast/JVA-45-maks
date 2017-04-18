package tv;

/**
 * Created by red6 on 4/18/2017.
 */
public class Pult {
    private String action;
    private Button onOffButton;
    private Button [] channelsButtons;


    public Pult(String action) {
        this.action = action;
    }

    public Pult() {
    }

    public Pult(Button onOffButton) {
        this.onOffButton = onOffButton;
    }

    public void setUpOnOffButton() {
        onOffButton = new Button();
        this.onOffButton = onOffButton;
    }

    public void setUpChannelsButtons() {
        channelsButtons = new Button[9];
        int channel = 1;
        for (Button currentButtonChannel:channelsButtons) {
            currentButtonChannel.setChannel(channel);
            channel = channel +1;
        }
        this.channelsButtons = channelsButtons;
    }

    public void changeChannel(int channel) {
//        for now only print of current works
        this.channelsButtons[channel-1].printPressedChannel();
    }


    public void pressOn() {
        onOffButton.setWhatToDo("On");
    }

    public void pressOff() {
        onOffButton.setWhatToDo("Off");
    }

    // internal class button
    public class Button {
//        on of  button or channel
        private String whatToDo;
        private int channel;


        public void setWhatToDo(String whatToDo) {
            this.whatToDo = whatToDo;
            System.out.println("Button pressed " + whatToDo);
        }

        public void printPressedChannel() {
            System.out.println("Channel pressed " + getChannel());
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }
    }

}
