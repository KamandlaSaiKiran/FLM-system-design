//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    IPayment p1  = new UPIPayment();
    p1.pay();

    IPayment cardWithFee  = new FeeDecorator(new CardPayment(), new CardFee());
    cardWithFee.pay();

    IPayment UPIWithFee  = new FeeDecorator(new UPIPayment(), new UPIFee());
    UPIWithFee.pay();


    IPayment cardWithReward  = new RewardDecorator(new CardPayment(), new CardReward());
    cardWithReward.pay();

    IPayment UPIWithReward  = new RewardDecorator(new UPIPayment(), new UPIReward());
    UPIWithReward.pay();

    IPayment upiWithRewardAndThenFees = new FeeDecorator(new RewardDecorator(new UPIPayment(), new UPIReward()),new CardFee()); // both case
    upiWithRewardAndThenFees.pay();

    IPayment cardWithFeeAndThenReward = new RewardDecorator(new FeeDecorator(new CardPayment(), new CardFee()), new CardReward());
    cardWithFeeAndThenReward.pay();

}
