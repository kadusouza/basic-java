public class Telegram extends InstantMessageService {
    public void sendMessage() {
        checkInternetConection();
        System.out.println("Sending message via Telegram");
    }

    public void receiveMessage() {
        checkInternetConection();
        saveMessageHistory();
        System.out.println("Receiving message via Telegram");
    }
}
