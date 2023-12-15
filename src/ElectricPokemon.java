import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName()+ " attacks with thunder against " + enemy.getName());
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 60 damage to the hp of " + enemy.getName());
                         enemy.setHp(getHp()-60);
            }

            case "ele"
        }
    }

    void electroBall(Pokemon name, Pokemon enemy){
    }

    void thunder(Pokemon name, Pokemon enemy){
    }

    void voltTackle(Pokemon name, Pokemon enemy){
    }


}
