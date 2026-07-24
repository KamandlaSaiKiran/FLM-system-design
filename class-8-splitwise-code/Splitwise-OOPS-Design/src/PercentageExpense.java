import java.util.List;

public class PercentageExpense extends Expense {

    public PercentageExpense(String description, User paidBy, double amount) {
        super(description, paidBy, amount);
    }

    @Override
    public List<Split> calculateSplits(List<User> participants, List<Double> values) {
        return List.of();
    }
}
