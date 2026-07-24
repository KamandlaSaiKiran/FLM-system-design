import java.util.List;

public class EqualExpense extends Expense{

    public EqualExpense(String description, User paidBy, double amount) {
        super(description, paidBy, amount);
    }

    @Override
    public List<Split> calculateSplits(List<User> participants, List<Double> values) {
        return List.of();
    }
}
