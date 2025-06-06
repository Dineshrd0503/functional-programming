package financedashboard;

import java.time.LocalDateTime;

public record Transaction(double amount, Category category, LocalDateTime datetime, String description, boolean isincome){
}
