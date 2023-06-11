public class FacebookMessenger extends InstantMessageService {
    public void sendMessage() {
        checkInternetConection();
        System.out.println("Sending message via facebook messenger");
    }

    public void receiveMessage() {
        checkInternetConection();
        saveMessageHistory();
        System.out.println("Receiving message via Facebook Messenger");
    }
}
