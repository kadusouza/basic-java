import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Input your name");
        String name = scanner.next();

        System.out.println("Input your lastName");
        String lastName = scanner.next();

        System.out.println("Input your age");
        int age = scanner.nextInt();

        System.out.println("Input your height");
        double height = scanner.nextDouble();

        System.out.println("Hi, my name is " + name.toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("I'm " + age + " years old");
        System.out.println("My height is " + height + "cm ");
        scanner.close();} catch (InputMismatchException e) {
            System.out.println("Exception: Input data not valid, remember height and age cant be string");
        }
    }
}
