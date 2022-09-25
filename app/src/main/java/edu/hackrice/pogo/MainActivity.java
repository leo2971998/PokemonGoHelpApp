package edu.hackrice.pogo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    Button buttonPokedex;
    RecyclerView recyclerView;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPokedex = findViewById(R.id.buttonPokedex);
        View.OnClickListener buttonDiscordClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PokedexActivity.class);
                startActivity(i);
            }
        };
        buttonPokedex.setOnClickListener(buttonDiscordClickListener);
    }
}