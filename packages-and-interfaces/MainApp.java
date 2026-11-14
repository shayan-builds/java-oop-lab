import transaction.Account;
import reports.TransactionReport;

public class MainApp {

    public static void main(String[] args) {

        Account acc = new Account(1001, 5000);

        acc.deposit(2000);
        acc.withdraw(1500);

        TransactionReport report = new TransactionReport();

        report.generateReport(acc);
    }
}