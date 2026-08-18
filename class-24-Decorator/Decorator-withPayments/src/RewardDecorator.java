public class RewardDecorator extends BaseDecorator{

    IRewardStrategy rewardStrategy;

    public RewardDecorator(IPayment ip, IRewardStrategy rewardStrategy) {
        super(ip);
        this.rewardStrategy = rewardStrategy;
    }

    @Override
    public void pay() {
        ip.pay();
        rewardStrategy.getRewarded();
    }
}
