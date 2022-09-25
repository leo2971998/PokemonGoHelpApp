package edu.hackrice.pogo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;


public class ProgramAdapter extends ArrayAdapter<PokedexClass> {

    private PokedexClass[] pokedexList;
    private int resource;
    public ProgramAdapter(Context context, int resource, PokedexClass[] pokedexList ) {
        super(context, resource, pokedexList);
        this.resource = resource;
        this.pokedexList = pokedexList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View singleItem;
        LayoutInflater  layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        singleItem = layoutInflater.inflate(resource,null);
        TextView pokemonName = singleItem.findViewById(R.id.pokemonName);
        TextView pokedexId = singleItem.findViewById(R.id.pokedexID);
        ImageView pokemonImage = singleItem.findViewById(R.id.pokemonImage);
        TextView type1 = singleItem.findViewById(R.id.Type1);
        TextView type2 = singleItem.findViewById(R.id.Type2);
        PokedexClass pokemons = pokedexList[position];
        pokemonName.setText(pokemons.getPokemonName());
        pokedexId.setText(pokemons.getPokedexId());
        pokemonImage.setImageResource(pokemons.getPokemonImage());
        type1.setText(pokemons.getType1());
        type2.setText(pokemons.getType2());
        return singleItem;
    }
}
