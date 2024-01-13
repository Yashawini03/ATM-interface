import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000; // Initial balance for demo purposes

    public static void main(String[] args) {
        showWelcomeScreen();
        login();
    }

    private static void showWelcomeScreen() {
        System.out.println("Welcome to the ATM System");
    }

    private static void login() {
        System.out.print("Enter User ID: ");
        String userId = scanner.next();
        System.out.print("Enter User PIN: ");
        String pin = scanner.next();

        // Perform authentication here (compare with stored user data)
        // For simplicity, let's assume user authentication is always successful
        showMainMenu();
    }

    private static void showMainMenu() {
        int choice;
        do {
            System.out.println("\n1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showTransactionHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    private static void showTransactionHistory() {
        // Implement transaction history display logic here
        System.out.println("Transaction history not available in this demo.");
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance. Please try again.");
        }
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    private static void transfer() {
        // Implement funds transfer logic here
        System.out.println("Transfer functionality not available in this demo.");
    }
}