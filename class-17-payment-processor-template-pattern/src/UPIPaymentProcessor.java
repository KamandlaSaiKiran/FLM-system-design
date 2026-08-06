public class UPIPaymentProcessor extends PaymentProcessor {

    @Override
    public IPayment createPayment() {
        return new UPIPayment();
    }
}
