package TVs;

public class SmartTV {
    public boolean isON = false;
    public int channel = 5;
    public int volume = 25;

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
