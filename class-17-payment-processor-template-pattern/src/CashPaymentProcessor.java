public class CashPaymentProcessor extends PaymentProcessor {

    @Override
    public IPayment createPayment() {
        return new CashPayment();
    }

    @Override
    public boolean requiresOTPVerification(){
        return false;
    }
}