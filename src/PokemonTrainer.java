import java.util.List;

public class PokemonTrainer {

    private String name;


    public PokemonTrainer (String name, List<Pokemon> pokemons){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
    }
}
