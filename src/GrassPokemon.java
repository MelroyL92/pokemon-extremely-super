import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    List<String> attacks = Arrays.asList("leaveBlade", "leechSeed", "leafStorm", "solarBeam");

    @Override
    protected void attack(Pokemon opponent) {
        switch (opponent.getType()){
            case "water" -> {
                System.out.println(this.getName() + " does 60 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-60);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "electric" -> {
                System.out.println(this.getName() + "does 20 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-20);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "grass" -> {
                System.out.println(this.getName() + "does 10 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp()-10);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 15 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 15);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
        }
    }

    public void leechSeed(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with Leech seed against " + opponent.getName());
        attack(opponent);
    }

    public void leaveBlade(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with leave blade against " + opponent.getName());
        attack(opponent);
    }

    public void leafStorm(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with leaf storm against " + opponent.getName());
        attack(opponent);
    }

    public void solarBeam(Pokemon name, Pokemon opponent){
        System.out.println(this.getName()+ " attacks with solarbeam against " + opponent.getName());
        attack(opponent);
    }

    List<String> getAttacks() {
        return attacks;
    }
}
