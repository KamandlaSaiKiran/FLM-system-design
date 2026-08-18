public class CardFee implements IFeeStrategy{
    @Override
    public void deductFee() {
        System.out.println("deduct card fine");
    }
}
