public interface ISubject {

    public void subscribe(ISubscriber subscriber);

    public void unsubscribe(ISubscriber subscriber);
}
