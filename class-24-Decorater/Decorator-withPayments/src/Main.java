//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    IPayment p1  = new UPIPayment();
    p1.pay();

    IPayment cardWithFee  = new FeeDecorator(new CardPayment());
    cardWithFee.pay();

    IPayment UPIWithFee  = new FeeDecorator(new UPIPayment());
    UPIWithFee.pay();


    IPayment cardWithReward  = new RewardDecorator(new CardPayment());
    cardWithReward.pay();

    IPayment UPIWithReward  = new RewardDecorator(new UPIPayment());
    UPIWithReward.pay();

    IPayment upiWithRewardAndThenFees = new FeeDecorator(new RewardDecorator(new UPIPayment())); // both case
    upiWithRewardAndThenFees.pay();

    IPayment cardWithFeeAndThenReward = new RewardDecorator(new FeeDecorator(new CardPayment()));
    cardWithFeeAndThenReward.pay();

}
