public class User implements ISubscriber {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("notification " + message );
    }
}
