public class FeeDecorator extends BaseDecorator{

    IFeeStrategy feePlan;


    public FeeDecorator(IPayment ip, IFeeStrategy feePlan) {
        super(ip);
        this.feePlan = feePlan;
    }

    @Override
    public void pay() {
        feePlan.deductFee();
        ip.pay();
    }
}
