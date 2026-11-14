package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account account) {
        System.out.println("\n----- TRANSACTION REPORT -----");

        System.out.println("Account Number: "
                + account.getAccountNumber());

        System.out.println("Current Balance: "
                + account.getBalance());

        System.out.println("------------------------------");
    }
}