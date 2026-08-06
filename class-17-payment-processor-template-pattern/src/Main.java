//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PaymentProcessor processor =  new CashPaymentProcessor();
    processor.processOrder(500.0);
}
