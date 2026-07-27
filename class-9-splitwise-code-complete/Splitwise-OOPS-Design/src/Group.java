import java.util.ArrayList;
import java.util.List;

public class Group {

    private String id;
    private String name;

    private List<User> members;

    // list of expense
    List<Expense> expenses;

    // all the splits
    List<Split> splits;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Group(String id, String name) {
        this.id = id;
        this.name = name;

        members = new ArrayList<>();
        expenses = new ArrayList<>();
        splits = new ArrayList<>();
    }

    // add a member
    public void addMember(User member) {
        members.add(member);
    }


    // addExpense : as soon as I add an expense splits should be generated

    public void addExpense(Expense expense, List<User> participants, List<Double> values)
    {
        // runtime polymorphism based on type of Expense

        //splits should be generated
        List<Split> newSplits = expense.calculateSplits(participants, values); // most imp line : runtime polymorphism


        splits.addAll(newSplits);
        expenses.add(expense);
    }



    // get balance of a particular user
    public double getBalance(String userId){
        double balance = 0;

        for(Split split : splits){
            if(split.getCreditor().getId().equals(userId)){
                balance += split.getAmount();
            }
            if(split.getDebitor().getId().equals(userId)){
                balance -= split.getAmount();
            }

        }
        return balance;
    }




}
