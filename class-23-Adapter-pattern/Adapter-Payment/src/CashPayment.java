public class CashPayment {

    // this is the incompatible / legacy class
    // it does NOT implement IPayment, and we are not allowed to change it

    public void makePayment() {
        System.out.println("paying using cash");
    }
}
