package com.example.l8anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Switch action;
    private Switch music;
    private Switch drama;
    private Switch horror;
    private Switch mystery;
    private Switch romance;
    private Switch schoolLife;
    private Switch scifi;
    private TextView defaultTV;
    Recommendations recommendations = new Recommendations();


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
            defaultTV.append("action is checked.");
        }

        //check if Music is checked
        if (music.isChecked()) {
            defaultTV.append("\ncomedy is checked.");
        }

        //check if Drama is checked
        if (drama.isChecked()) {
            defaultTV.append("\ndrama is checked.");
        }

        //check if Horror is checked
        if (horror.isChecked()) {
            defaultTV.append("\nhorror is checked.");
        }

        //check if Mystery is checked
        if (mystery.isChecked()) {
            defaultTV.append("\nmystery is checked.");
        }

        //check if Romance is checked
        if (romance.isChecked()) {
            defaultTV.append("\nromance is checked.");
        }

        //check if School Life is checked
        if (schoolLife.isChecked()) {
            defaultTV.append("\nschool life is checked.");
        }

        //check if SciFi is checked
        if (scifi.isChecked()) {
            defaultTV.append("\nsci-fi is checked.");
        }

        //IF all others fail and the TextView is still blank, return an error
        if (defaultTV.getText().toString().matches("")) {
            defaultTV.setText(recommendations.errorReturn());
            defaultTV.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }
    }

    public void emptyMethodTemp(){

    }
}