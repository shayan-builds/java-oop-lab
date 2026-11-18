import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMDemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        try {
            System.out.print("Enter withdrawal amount: ");
            String input = sc.nextLine();

            double amount = Double.parseDouble(input);

            if (amount <= 0) {
                throw new ArithmeticException(
                    "Withdrawal amount must be positive."
                );
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient bank balance."
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: ₹" + balance);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a numeric amount.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for using the ATM.");
            sc.close();
        }
    }
}