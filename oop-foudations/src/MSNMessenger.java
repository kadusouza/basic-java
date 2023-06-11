public class MSNMessenger extends InstantMessageService {
    public void sendMessage() {
        checkInternetConection();
        System.out.println("Sending message via MSN Messenger");
    }

    public void receiveMessage() {
        checkInternetConection();
        saveMessageHistory();
        System.out.println("Receiving message via MSN Messenger");
    }

}