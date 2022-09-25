package edu.hackrice.lifehackstartercode;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    Button buttonChangeGreeting;
    Button buttonGoToWelcome;
    TextView textViewGreeting;
    Button buttonDiscord;
    RecyclerView recyclerView;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonChangeGreeting = findViewById(R.id.buttonChangeGreeting);
        buttonGoToWelcome = findViewById(R.id.buttonGoToWelcome);
        textViewGreeting = findViewById(R.id.textHello);
        buttonDiscord = findViewById(R.id.buttonDiscord);
        View.OnClickListener buttonChangeGreetingClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewGreeting.setText("Hello Hackers!");
            }
        };
        buttonChangeGreeting.setOnClickListener(buttonChangeGreetingClickListener);

        View.OnClickListener buttonGoToWelcomeClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                i.putExtra("message", "Welcome to HackRice 12 First Timers Track!");
                startActivity(i);
            }
        };
        View.OnClickListener buttonDiscordClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://discord.gg/pokemongocoordinates");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        };
        buttonGoToWelcome.setOnClickListener(buttonGoToWelcomeClickListener);
        buttonDiscord.setOnClickListener(buttonDiscordClickListener);
    }
}