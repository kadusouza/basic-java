import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Calling...");

        do {
            //execute until somebody answers
            System.out.println("Telephone ringing...");

        } while(ringing());

        System.out.println("Hello !!!");
    }
    private static boolean ringing() {
        boolean answered = new Random().nextInt(3)==1;
        System.out.println("Answered? " + answered);
        //negation of the act of ringing it
        return ! answered;
    }
}

