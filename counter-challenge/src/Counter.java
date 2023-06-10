import java.util.Scanner;

/*
Counts the difference between two numbers.
To test valid parameters, input 12 and 18.
To test invalid parameters, input 20 and 10.
*/
public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Input the first parameter: ");
        int parameterOne = terminal.nextInt();
        System.out.println("Input the second parameter: ");
        int parameterTwo = terminal.nextInt();

        try {
            int count  = contar(parameterOne, parameterTwo);

            for (int i = 1; i <= count; i++) {
                System.out.println("Counting: " + i);
            }

        }catch (InvalidParameterException exception) {
            System.out.println("Exception: The second parameter must be grater than the first parameter");
        }

    }
    static int contar(int parameterOne, int parameterTwo ) throws InvalidParameterException {
        if (parameterOne > parameterTwo)
            throw new InvalidParameterException();

        return parameterTwo - parameterOne;
    }

}