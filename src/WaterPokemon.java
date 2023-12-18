import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "water");

    }

    List<String> attacks = Arrays.asList("surf", "rainDance", "hydroPump", "hydroCanon");
    List<String> foods = Arrays.asList("pokeLeaf", "pokeFlake", "everything", "fireNougats", "Pokebrocks");

    @Override
    protected void attack(Pokemon opponent) {
        switch (opponent.getType()) {
            case "water" -> {
                System.out.println(this.getName() + " does 10 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 10);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "electric" -> {
                System.out.println(this.getName() + "does 20 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 20);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "grass" -> {
                System.out.println(this.getName() + "does 10 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 10);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
            case "fire" -> {
                System.out.println(this.getName() + " does 60 damage to the hp of " + opponent.getName());
                opponent.setHp(opponent.getHp() - 60);
                System.out.println("the new hp of " + opponent.getName() + " = " + opponent.getHp());
            }
        }
    }

    void surf(Pokemon name, Pokemon opponent){
            System.out.println(this.getName()+ " attacks with surf against " + opponent.getName());
            attack(opponent);
    }

    void hydroPump(Pokemon name, Pokemon opponent){
            System.out.println(this.getName()+ " attacks with hydropump against " + opponent.getName());
            attack(opponent);
    }
    void hydroCanon(Pokemon name, Pokemon opponent){
            System.out.println(this.getName()+ " attacks with hydrocanon against " + opponent.getName());
            attack(opponent);
    }

    public void rainDance(Pokemon name, Pokemon opponent){
            System.out.println(this.getName()+ " attacks with rain dance against " + opponent.getName());
            attack(opponent);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void pokeflakes(Pokemon pokemon, String food) {
        if (food.equalsIgnoreCase("pokeflakes")){
            pokemon.setHp(getHp() + 40);
            System.out.println("the new hp of " + pokemon.getName() + " = " + pokemon.getHp());
        }
    }
}
