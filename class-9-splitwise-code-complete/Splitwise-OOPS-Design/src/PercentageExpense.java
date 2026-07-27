import java.util.ArrayList;
import java.util.List;

public class PercentageExpense extends Expense {

    public PercentageExpense(String description, User paidBy, double amount) {
        super(description, paidBy, amount);
    }

    @Override
    public List<Split> calculateSplits(List<User> participants, List<Double> values) {

        // participants -> [u1 u2 u3]
        // values -> [10, 70, 20] -> 100%

        // CALCULATE TOTAL SUM :

        double totalPercent = 0;
        for(double value : values){
            totalPercent += value;
        }

        if(Math.abs(totalPercent -100) > 0.01){
            throw new IllegalArgumentException("Total percentage is " + totalPercent + "%");
        }

        List<Split> splits = new ArrayList<Split>();

        for(int i=0;i<participants.size();i++){

            double share = (values.get(i)/100)*getAmount();
            splits.add(new Split(getPaidBy(), participants.get(i), share));
        }

        return splits;
    }
}
