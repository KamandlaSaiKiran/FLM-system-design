import java.util.List;

public abstract class Expense {

    private String description;
    private User paidBy;
    private double amount;

    public Expense(String description, User paidBy, double amount) {
        this.description = description;
        this.paidBy = paidBy;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract List<Split> calculateSplits(List<User> participants, List<Double> values);
}
