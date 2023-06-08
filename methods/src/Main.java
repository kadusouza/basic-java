public class Main {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.turnOnOrOff();
        smartTV.turnOnOrOff();
        System.out.println("Is the TV on? " + smartTV.isON);
        smartTV.changeChannel(88);
        smartTV.changeChannel();
        System.out.println("Current channel: " + smartTV.channel);
        smartTV.raiseVolume();
        smartTV.raiseVolume();
        smartTV.lowerVolume();
        System.out.println("Current volume: " + smartTV.volume);
    }
}