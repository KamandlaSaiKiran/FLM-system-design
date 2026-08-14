public class ForestLevel extends Level{

    @Override
    IEnemy createEnemy() {
        return new Goblin();
    }
}
