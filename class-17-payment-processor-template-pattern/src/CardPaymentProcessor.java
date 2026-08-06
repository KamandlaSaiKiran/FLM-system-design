public class CardPaymentProcessor extends PaymentProcessor {

    @Override
    public IPayment createPayment() {
        return new  CardPayment();
    }
}
