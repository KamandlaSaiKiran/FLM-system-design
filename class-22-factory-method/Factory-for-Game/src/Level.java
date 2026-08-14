public abstract class Level {

    abstract IEnemy createEnemy();


    public void startLevel(){

        IEnemy enemy = createEnemy();
        enemy.attack();
    }


}
