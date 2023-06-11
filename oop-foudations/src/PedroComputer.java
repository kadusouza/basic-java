public class PedroComputer {
    public static void main(String[] args) {

        InstantMessageService ims = null;

		/*
		    WE DON'T KNOW WHICH APP
		    ANY CHOSEN APP SHOULD SEND AND RECEIVE MESSAGES
		 */
        String chosenApp="fbm";

        if(chosenApp.equals("msn"))
            ims = new MSNMessenger();
        else if(chosenApp.equals("fbm"))
            ims = new FacebookMessenger();
        else if(chosenApp.equals("tlg"))
            ims = new Telegram();

        ims.sendMessage();
        ims.receiveMessage();
    }
}