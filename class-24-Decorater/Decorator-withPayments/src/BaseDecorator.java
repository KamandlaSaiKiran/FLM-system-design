public abstract class BaseDecorator implements IPayment {

    public IPayment ip;

    public BaseDecorator(IPayment ip) {
        this.ip = ip;
    }
}
