package com.example.l8anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Switch action;
    private Switch comedy;
    private Switch drama;
    private Switch horror;
    private Switch mystery;
    private Switch romance;
    private Switch schoolLife;
    private Switch scifi;
    private TextView defaultTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        action = findViewById(R.id.actionSwitch);
        comedy = findViewById(R.id.comedySwitch);
        drama = findViewById(R.id.dramaSwitch);
        horror = findViewById(R.id.horrorSwitch);
        mystery = findViewById(R.id.mysterySwitch);
        romance = findViewById(R.id.romanceSwitch);
        schoolLife = findViewById(R.id.schoolLifeSwitch);
        scifi = findViewById(R.id.scifiSwitch);
        defaultTV = findViewById(R.id.defaultTV);
    }

    public void onSubmitClick(View view){
        defaultTV.setText("");

        //probably something simple, but we want ALL included values. it is currently displaying only the first result.
        if(action.isChecked()){
            defaultTV.append("action is checked.");
        } else if(comedy.isChecked()){
            defaultTV.append("\ncomedy is checked.");
        } else if(drama.isChecked()){
            defaultTV.append("\ndrama is checked.");
        } else if(horror.isChecked()) {
            defaultTV.append("\nhorror is checked.");
        } else if(mystery.isChecked()) {
            defaultTV.append("\nmystery is checked.");
        } else if(romance.isChecked()){
            defaultTV.append("\nromance is checked.");
        } else if(schoolLife.isChecked()){
            defaultTV.append("\nschool life is checked.");
        } else if(scifi.isChecked()) {
            defaultTV.append("\nsci-fi is checked.");
        } else {
            defaultTV.setText("There is nothing selected. :)");
        }
    }

    public void emptyMethodTemp(){

    }
}