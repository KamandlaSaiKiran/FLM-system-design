import java.util.ArrayList;
import java.util.List;

public class EqualExpense extends Expense{

    public EqualExpense(String description, User paidBy, double amount) {
        super(description, paidBy, amount);
    }

    @Override
    public List<Split> calculateSplits(List<User> participants, List<Double> values) {

        //calculate share per person
        double share  = getAmount()/participants.size();


        // create the splits array
        List<Split> splits= new ArrayList<>();


        // iterate over all participants
        for(User u : participants){

            // add a split entry in the splits array that we created outside the loop
            splits.add(new Split(getPaidBy(),u, share));
        }

        // return the splits array
        return splits;


    }
}
