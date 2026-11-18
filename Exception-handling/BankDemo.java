class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: ₹" + balance);
    }
}

public class BankDemo {
    public static void main(String args[]) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for banking with us.");
        }
    }
}