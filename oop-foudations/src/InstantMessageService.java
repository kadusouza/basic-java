public abstract class InstantMessageService {
    public abstract void sendMessage();
    public abstract void receiveMessage();

    protected void checkInternetConection() {
        System.out.println("Checking the internet connection");
    }
    protected void saveMessageHistory() {
        System.out.println("Saving message history");
    }
}
