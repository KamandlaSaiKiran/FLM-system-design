public class Split {

    private final User creditor;
    private final User debitor;
    private final double amount;

    public Split(User creditor, User debitor, double amount) {
        this.creditor = creditor;
        this.debitor = debitor;
        this.amount = amount;
    }

    public User getCreditor() {
        return creditor;
    }
    public User getDebitor() {
        return debitor;
    }
    public double getAmount() {
        return amount;
    }

}
