package character;

public class EnemyHeroIsDead extends Exception {

    public EnemyHeroIsDead(){

    }
    public EnemyHeroIsDead( String msg){

        super(msg);
    }
}
