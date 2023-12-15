import java.util.List;

public class PokemonGymOwner {
    private String name;
    private String town;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        this.name = name;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }


    public Pokemon[] getPokemons() {
    }
}
