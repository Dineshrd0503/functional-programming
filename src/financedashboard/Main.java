package financedashboard;


import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinanceDashboard dashboard = new FinanceDashboard();
        TransactionGenerator generator = new TransactionGenerator();
        generator.startgenerating();
        dashboard.processRealTimeTransactions(generator.getQueue());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Personal Finance Dashboard Started...");

        while (true) {
            System.out.println("\n1. View Balance\n2. Spending by Category\n3. Forecast Savings\n4. Monthly Report\n5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + dashboard.calculateBalance());
                    break;
                case 2:
                    dashboard.getSpendingByCategory().forEach((c, total) -> System.out.println(c + ": $" + total));
                    break;
                case 3:
                    System.out.print("Enter months to forecast: ");
                    int months = scanner.nextInt();
                    dashboard.forecastSavings(months).ifPresentOrElse(
                            s -> System.out.println("Projected Savings: $" + s),
                            () -> System.out.println("Insufficient data for forecast")
                    );
                    break;
                case 4:
                    dashboard.generateReport(
                            t -> t.datetime().getMonth(),
                            t -> t.datetime().isAfter(LocalDateTime.now().minusMonths(1))
                    ).forEach((m, total) -> System.out.println(m + ": $" + total));
                    break;
                case 5:
                    generator.stop();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
