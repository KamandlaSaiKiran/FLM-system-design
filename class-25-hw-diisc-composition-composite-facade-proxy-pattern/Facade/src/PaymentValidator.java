public class PaymentValidator {

    public void validate(Order order) {
        System.out.println("validating order for amount: " + order.getAmount());
    }
}
