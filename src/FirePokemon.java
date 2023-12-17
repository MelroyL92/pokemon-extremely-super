import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    public FirePokemon (String name, int level, int hp, String food, String sound) {
       super(name, level, hp, food, sound, "fire");
    }

    List<String> attacks = Arrays.asList("flameThrower", "pyroBall", "fireLash", "inferno");

    @Override
    protected void attack(Pokemon opponent) {
        switch (opponent.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 10 damage to the hp of " + opponent.getName());
                opponent.setHp(getHp()-10);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());            }
            case "electric" -> {
                System.out.println(this.getName() + "does 40 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-40);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "grass" -> {
                System.out.println(this.getName() + "does 60 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-60);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 10 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 10);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
        }
    }
    void inferno (Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with inferno against " + opponent.getName());
        attack(opponent);
    }

    void flameThrower(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with flamethrower against " + opponent.getName());
        attack(opponent);

    }

    void pyroBall(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with pyroball against " + opponent.getName());
        attack(opponent);
    }

    void fireLash(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with fireLash against " + opponent.getName());
        attack(opponent);
    }


    List<String> getAttacks() {
        return attacks;
    }

}
