public class Iphone implements MusicPlayer, Telephone, InternetBrowser {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.displayPage();
        iphone.addNewTab();
        iphone.refreshPage();
        iphone.play();
        iphone.pause();
        iphone.selectMusic("The Beatles - Hey Jude");
        iphone.call("555-555-5555");
        iphone.answer();
        iphone.voiceMail();
    }

    @Override
    public void displayPage() {
        System.out.println("Displaying page...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void selectMusic(String selectedMusic) {
        System.out.println("Selecting music: " + selectedMusic);
    }

    @Override
    public void call(String contact) {
        System.out.println("Calling " + contact + "...");
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
    }

    @Override
    public void voiceMail() {
        System.out.println("Entering voice mail...");
    }
}