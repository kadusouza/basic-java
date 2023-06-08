public class Main {
    public static void main(String[] args) {
        byte age = 123;
        short year = 2021;
        int zipcode = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salary = 1275.33;

        short shorNUmber = 1;
        int normalNumber = shorNUmber;
        short shortNumber2 = (short) normalNumber;

        int number = 5;
        number = 10;
        System.out.println(shortNumber2);

        final double VALUE_OF_PI = 3.14;

        String name = "João";
        char letter = 'a';
    }
}