public class FurnitureStore {

    private final FurnitureFactory factory;

    public FurnitureStore(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void furnishRoom() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        sofa.lieOn();
    }
}
