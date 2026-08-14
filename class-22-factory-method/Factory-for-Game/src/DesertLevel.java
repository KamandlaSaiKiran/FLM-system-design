public class DesertLevel extends Level{

    @Override
     IEnemy createEnemy() {
        return new SandMan();
    }
}
