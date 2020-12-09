package com.example.l8anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Switch action, drama, horror, music, mystery, romance, schoolLife, scifi;
    private Button submitButton;
    private TextView defaultTV;
    public int selectedGeneres = 0;
    public static final int ACTION_BIT      = 0b00000001;
    public static final int DRAMA_BIT       = 0b00000010;
    public static final int HORROR_BIT      = 0b00000100;
    public static final int MUSIC_BIT       = 0b00001000;
    public static final int MYSTERY_BIT     = 0b00010000;
    public static final int ROMANCE_BIT     = 0b00100000;
    public static final int SCHOOLLIFE_BIT  = 0b01000000;
    public static final int SCIFI_BIT       = 0b10000000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        action = findViewById(R.id.actionSwitch);
        music = findViewById(R.id.musicSwitch);
        drama = findViewById(R.id.dramaSwitch);
        horror = findViewById(R.id.horrorSwitch);
        mystery = findViewById(R.id.mysterySwitch);
        romance = findViewById(R.id.romanceSwitch);
        schoolLife = findViewById(R.id.schoolLifeSwitch);
        scifi = findViewById(R.id.scifiSwitch);
        defaultTV = findViewById(R.id.defaultTV);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSubmitClick();
                nextActivityOnClick();
            }
        });
    }

    //instantiated for switching to the second UI
    private void nextActivityOnClick() {
        Intent secondaryActivity = new Intent(MainActivity.this, MainActivity2.class);
        secondaryActivity.putExtra("selection", selectedGeneres);
        startActivity(secondaryActivity);
    }

    //checks for switches that are true, and sets their states appropriately
    public void onSubmitClick() {
        defaultTV.setText("");

        //check if Action is checked
        if (action.isChecked()) {
            defaultTV.append("\nAction is checked.");

            /*if checked, take the ACTION_BIT and set it to selectedGenres. Selected genres will
            take this binary number, and check if its on or not before passing the info to the
            second main class.
             */
            selectedGeneres |= ACTION_BIT;
        }

        //check if Drama is checked
        if (drama.isChecked()) {
            defaultTV.append("\nDrama is checked.");
            selectedGeneres |= DRAMA_BIT;
        }

        //check if Horror is checked
        if (horror.isChecked()) {
            defaultTV.append("\nHorror is checked.");
            selectedGeneres |= HORROR_BIT;
        }

        //check if Music is checked
        if (music.isChecked()) {
            defaultTV.append("\nMusic is checked.");
            selectedGeneres |= MUSIC_BIT;
        }

        //check if Mystery is checked
        if (mystery.isChecked()) {
            defaultTV.append("\nMystery is checked.");
            selectedGeneres |= MYSTERY_BIT;
        }

        //check if Romance is checked
        if (romance.isChecked()) {
            defaultTV.append("\nRomance is checked.");
            selectedGeneres |= ROMANCE_BIT;
        }

        //check if School Life is checked
        if (schoolLife.isChecked()) {
            defaultTV.append("\nSchool Life is checked.");
            selectedGeneres |= SCHOOLLIFE_BIT;
        }

        //check if SciFi is checked
        if (scifi.isChecked()) {
            defaultTV.append("\nSci-Fi is checked.");
            selectedGeneres |= SCIFI_BIT;
        }
    }
}