public class CashPayment implements IPayment {

    @Override
    public void pay(double amount) {
        System.out.println("payment of " + amount + "through cash");
    }
}
