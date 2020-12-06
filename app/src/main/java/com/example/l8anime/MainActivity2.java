package com.example.l8anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button goBackButton;
    private TextView recommendationOutput;
    Recommendations outputView = new Recommendations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        goBackButton = findViewById(R.id.goBackButton);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivityOnClick();
            }
        });
    }

    private void nextActivityOnClick() {
        Intent secondaryActivity = new Intent(MainActivity2.this, MainActivity.class);
        startActivityForResult(secondaryActivity, 0);
    }

    public void resultDisplay(){
//        outputView.action.titlesA.indexOf();
        recommendationOutput.setText(outputView.actionNumberGenerated);
    }

//    public void messages(){
//        String outputs = null;
//        switch (outputs) {
//            case 1:
//                String message1 = "Awesome choice! Here's the anime's we recommend for you:";
//                break;
//            case 2:
//                String message2 = "Nice choices. Let's see what was recommended!";
//                break;
//            case 3:
//                String message3 = "Interesting. Based on those choices, we recommend these:";
//                break;
//            case 4:
//                String message4 = "Wasn't expecting that. But regardless, here's what we recommend:";
//                break;
//        }
//    }
}