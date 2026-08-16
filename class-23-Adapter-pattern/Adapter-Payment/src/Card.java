public class Card implements IPayment {

    @Override
    public void pay() {
        System.out.println("paying using card");
    }
}
