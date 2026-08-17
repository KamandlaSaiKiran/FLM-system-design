public class CardPayment implements IPayment {
    @Override
    public void pay() {
        System.out.println("Doing payment using UPI");
    }
}
