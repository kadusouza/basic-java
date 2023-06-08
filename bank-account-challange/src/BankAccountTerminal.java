import java.util.Scanner;

//Challenge
//Create a program that asks the user for the following information:
//Bank agency, number, client name and balance.
//Then display it, all through the terminal
public class BankAccountTerminal {
    int accountNumber;
    String bankAgency;
    String clientName;
    double balance;
    public static void main(String[] args) {
        BankAccountTerminal bankAccount = new BankAccountTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your bank agency: ");
        bankAccount.bankAgency = scanner.nextLine();
        System.out.println("Please enter your account number: ");
        bankAccount.accountNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your name: ");
        bankAccount.clientName = scanner.nextLine();
        System.out.println("Please enter your account balance: ");
        bankAccount.balance = scanner.nextDouble();

        System.out.println("Hello " + bankAccount.clientName + ", thank you for creating an account with us, your agency is " +
                bankAccount.bankAgency + ", account number " + bankAccount.accountNumber + " and your balance is " + bankAccount.balance +
                " dollars available for withdraw.");
    }
}