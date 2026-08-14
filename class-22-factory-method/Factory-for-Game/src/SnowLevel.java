public class SnowLevel extends Level{

    @Override
    IEnemy createEnemy() {
        return new SnowMan();
    }
}
