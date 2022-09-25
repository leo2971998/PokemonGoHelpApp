package edu.hackrice.pogo;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;


public class PokedexActivity extends AppCompatActivity {
    ListView pokedexList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
        pokedexList = findViewById(R.id.pokedexList);
        PokedexClass[] pokemons= new PokedexClass[]{
                new PokedexClass(R.drawable.bulbasaur, "#001", "Bulbasaur", "Grass", "Poison"),
                new PokedexClass(R.drawable.ivysaur, "#002", "Ivysaur", "Grass", "Poison"),
                new PokedexClass(R.drawable.venusaur, "#003", "Venusaur", "Grass", "Poison")
        };
        ProgramAdapter adapter = new ProgramAdapter(this, R.layout.single_item, pokemons);
        pokedexList.setAdapter(adapter);
    }
}
