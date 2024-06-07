import com.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Pokedex KantoDex = new Pokedex("assets/kanto.csv");
        System.out.println(KantoDex.getPokemon(7) + "\n");
        System.out.println(KantoDex.getPokemon("slowpoke") + "\n");

        Type pokemontype = KantoDex.getPokemon(10).getType();
        System.out.println(pokemontype == new Type("water"));
        System.out.println("It is actually a " + pokemontype);
    }
}