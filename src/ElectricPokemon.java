import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");


    void thunderPunch(Pokemon name, Pokemon opponent) {
        System.out.println(this.getName()+ " attacks with thunderpunch against " + opponent.getName());
        attack(opponent);
    }

    void electroBall(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with electroball against " + opponent.getName());
        attack(opponent);
    }
    @Override
    protected void attack(Pokemon opponent) {
        switch (opponent.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 60 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-60);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "electric" -> {
                System.out.println(this.getName() + "does 10 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-10);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "grass" -> {
                System.out.println(this.getName() + "does 20 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-20);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());            }
            case "fire" -> {
                System.out.println(this.getName() + " does 40 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 40);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
        }
    }

    void thunder(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with thunder against " + opponent.getName());
        attack(opponent);
    }

    void voltTackle(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with volt tackle against " + opponent.getName());
        attack(opponent);
    }

    List<String> getAttacks() {
        return attacks;
    }


}
