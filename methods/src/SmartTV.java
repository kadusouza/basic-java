public class SmartTV {
    boolean isON = false;
    int channel = 5;
    int volume = 25;

    public void turnOnOrOff() {
        isON = !isON;
    }

    public void changeChannel() {
        ++channel;
    }
    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void raiseVolume() {
        ++volume;
    }

    public void lowerVolume() {
        --volume;
    }
}
