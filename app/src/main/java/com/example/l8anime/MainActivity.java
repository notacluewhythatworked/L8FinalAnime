package com.example.l8anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Switch action;
    private Switch drama;
    private Switch horror;
    private Switch music;
    private Switch mystery;
    private Switch romance;
    private Switch schoolLife;
    private Switch scifi;
    private TextView defaultTV;
    Recommendations recommendations = new Recommendations();
    boolean actionState = false;
    boolean dramaState = false;
    boolean horrorState = false;
    boolean musicState = false;
    boolean mysteryState = false;
    boolean romanceState = false;
    boolean schoolLifeState = false;
    boolean scifiState = false;


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
    }

    public void onSubmitClick(View view) {
        defaultTV.setText("");

        //check if Action is checked
        if (action.isChecked()) {
            defaultTV.append("Action is checked.");
            actionState = true;
        }

        //check if Drama is checked
        if (drama.isChecked()) {
            defaultTV.append("\nDrama is checked.");
            dramaState = true;
        }

        //check if Horror is checked
        if (horror.isChecked()) {
            defaultTV.append("\nHorror is checked.");
            horrorState = true;
        }

        //check if Music is checked
        if (music.isChecked()) {
            defaultTV.append("\nMusic is checked.");
            musicState = true;
        }

        //check if Mystery is checked
        if (mystery.isChecked()) {
            defaultTV.append("\nMystery is checked.");
            mysteryState = true;
        }

        //check if Romance is checked
        if (romance.isChecked()) {
            defaultTV.append("\nRomance is checked.");
            romanceState = true;
        }

        //check if School Life is checked
        if (schoolLife.isChecked()) {
            defaultTV.append("\nSchool Life is checked.");
            schoolLifeState = true;
        }

        //check if SciFi is checked
        if (scifi.isChecked()) {
            defaultTV.append("\nSci-Fi is checked.");
            scifiState = true;
        }

        //IF all others fail and the TextView is still blank, return an error
        if (defaultTV.getText().toString().matches("")) {
            defaultTV.setText(recommendations.errorReturn());
            defaultTV.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }
    }
}