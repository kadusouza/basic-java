public class Main {
    public static void main(String[] args) {
        //ternary operator
        int a, b;
        a = 6;
        b = 5;

        String result = a==b ? "verdadeiro" : "falso";

        System.out.println(a != b ? "diferente" : "igual");

        int number1 = 2;
        int number2 = 1;

        if((number1 == 2) && (++ number2 == 2))
            System.out.println("Both conditions are true");

        System.out.println("number1 is now " + number1);
        System.out.println("number2 is now " + number2);

    }
}