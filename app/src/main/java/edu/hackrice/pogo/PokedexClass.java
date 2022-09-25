package edu.hackrice.pogo;
public class PokedexClass {

    int pokemonImage;
    String pokedexId;
    String pokemonName;
    String type1;
    String type2;

    public PokedexClass() {
    }

    public PokedexClass(int pokemonImage, String pokedexId, String pokemonName, String type1, String type2) {
        this.pokemonImage = pokemonImage;
        this.pokedexId = pokedexId;
        this.pokemonName = pokemonName;
        this.type1 = type1;
        this.type2 = type2;
    }

    public int getPokemonImage() {
        return pokemonImage;
    }

    public void setPokemonImage(int pokemonImage) {
        this.pokemonImage = pokemonImage;
    }

    public String getPokedexId() {
        return pokedexId;
    }

    public void setPokedexId(String pokedexId) {
        this.pokedexId = pokedexId;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }
}
