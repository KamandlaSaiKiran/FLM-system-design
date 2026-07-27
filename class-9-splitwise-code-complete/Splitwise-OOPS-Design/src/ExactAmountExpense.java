import java.util.ArrayList;
import java.util.List;

public class ExactAmountExpense extends Expense {

    public ExactAmountExpense(String description, User paidBy, double amount) {
        super(description, paidBy, amount);
    }

    @Override
    public List<Split> calculateSplits(List<User> participants, List<Double> values) {

        // amount -> 1000
        // participants -> [u1 u2 u3]
        // values -> [100, 700, 200] -> 1000

        // CALCULATE TOTAL SUM :

        double totalAmount = 0;
        for(double value : values){
            totalAmount += value;
        }

        if(Math.abs(totalAmount - getAmount()) > 0.01){
            throw new IllegalArgumentException("Total amount is " + totalAmount + "%");
        }

        List<Split> splits = new ArrayList<Split>();

        for(int i=0;i<participants.size();i++){

            splits.add(new Split(getPaidBy(), participants.get(i), values.get(i)));
        }

        return splits;

    }
}
