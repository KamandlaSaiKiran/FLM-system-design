import java.util.List;

public class ExactAmountExpense extends Expense {

    public ExactAmountExpense(String description, User paidBy, double amount) {
        super(description, paidBy, amount);
    }

    @Override
    public List<Split> calculateSplits(List<User> participants, List<Double> values) {
        return List.of();
    }
}
