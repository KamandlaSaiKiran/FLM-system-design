public class CardPayment implements IPayment{

    @Override
    public void pay(double amount) {
        System.out.println("payment of " + amount + "through card");
    }
}
