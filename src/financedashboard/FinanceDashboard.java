package financedashboard;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FinanceDashboard {
    private final List<Transaction> transactions = Collections.synchronizedList(new ArrayList<>());
    private final Map<Category, Double> budgets = new EnumMap<>(Category.class);

    public FinanceDashboard() {
        // Initialize sample budgets
        budgets.put(Category.FOOD, 500.0);
        budgets.put(Category.TRANSPORT, 200.0);
        budgets.put(Category.ENTERTAINMENT, 100.0);
        budgets.put(Category.BILLS, 300.0);
    }

    public void processRealTimeTransactions(BlockingQueue<Transaction> queue) {
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Transaction transaction = queue.take();
                    transactions.add(transaction);
                    System.out.println("New transaction: " + transaction);
                    checkBudgetAlerts(transaction);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }

    private void checkBudgetAlerts(Transaction transaction) {
        if (!transaction.isincome()) {
            double spent = getSpendingByCategory(transaction.category());
            double budget = budgets.getOrDefault(transaction.category(), Double.MAX_VALUE);
            if (spent > budget) {
                System.out.println("Alert: Overspent in " + transaction.category() + "! Spent: $" + spent + ", Budget: $" + budget);
            }
        }
    }

    public Map<Category, Double> getSpendingByCategory() {
        return transactions.stream()
                .filter(Predicate.not(Transaction::isincome))
                .collect(Collectors.groupingBy(
                        Transaction::category,
                        Collectors.summingDouble(Transaction::amount)
                ));
    }

    public double getSpendingByCategory(Category category) {
        return transactions.stream()
                .filter(Predicate.not(Transaction::isincome))
                .filter(t -> t.category() == category)
                .mapToDouble(Transaction::amount)
                .sum();
    }

    public double calculateBalance() {
        return transactions.stream()
                .mapToDouble(t -> t.isincome() ? t.amount() : -t.amount())
                .sum();
    }

    public Optional<Double> forecastSavings(int months) {
        double monthlyIncome = transactions.stream()
                .filter(Transaction::isincome)
                .mapToDouble(Transaction::amount)
                .average()
                .orElse(0.0);
        double monthlyExpense = transactions.stream()
                .filter(Predicate.not(Transaction::isincome))
                .mapToDouble(Transaction::amount)
                .average()
                .orElse(0.0);
        return monthlyIncome > 0 || monthlyExpense > 0
                ? Optional.of((monthlyIncome - monthlyExpense) * months)
                : Optional.empty();
    }

    public <T> Map<T, Double> generateReport(Function<Transaction, T> classifier, Predicate<Transaction> filter) {
        return transactions.stream()
                .filter(filter)
                .collect(Collectors.groupingBy(
                        classifier,
                        Collectors.summingDouble(Transaction::amount)
                ));
    }
}