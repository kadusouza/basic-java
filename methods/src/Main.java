import  TVs.SmartTV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartTV smartTV = new SmartTV();


        smartTV.turnOnOrOff();
        smartTV.turnOnOrOff();
        System.out.println("Is the TV on? " + smartTV.isON);
        smartTV.changeChannel(88);
        smartTV.channel = Integer.parseInt(args[0]);
        System.out.println("Input a channel: " );
        smartTV.channel = scanner.nextInt();
        smartTV.changeChannel();
        System.out.println("Current channel: " + smartTV.channel);
        smartTV.raiseVolume();
        smartTV.raiseVolume();
        smartTV.lowerVolume();
        System.out.println("Current volume: " + smartTV.volume);
    }
}