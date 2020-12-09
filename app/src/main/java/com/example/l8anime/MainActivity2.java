package com.example.l8anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.Html;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button goBackButton;
    private TextView recommendationOutput;
    Recommendations outputView = new Recommendations();
    private int selectedGenres = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recommendationOutput = findViewById(R.id.recommendationOutput);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            selectedGenres = extras.getInt("selection");
            System.out.println("SELECTED: " + selectedGenres);
        }

        outputView.selectedNums = selectedGenres;
        resultDisplay();

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        }


    public void resultDisplay(){
        if (selectedGenres == 0){
            recommendationOutput.setText(errorReturn());
        } else {
            recommendationOutput.setText("");
            if (outputView.actionRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>Action: </b>") + outputView.actionRecommend() + "\n");
            } if (outputView.dramaRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>Drama: </b>") + outputView.dramaRecommend() + "\n");
            } if (outputView.horrorRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>Horror: </b>") + outputView.horrorRecommend() + "\n");
            } if (outputView.musicRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>Music: </b>") + outputView.musicRecommend() + "\n");
            } if (outputView.mysteryRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>Mystery: </b>") + outputView.mysteryRecommend() + "\n");
            } if (outputView.romanceRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>Romance: </b>") + outputView.romanceRecommend() + "\n");
            } if (outputView.schoolLifeRecommend() != ""){
                recommendationOutput.append(Html.fromHtml("<b>School Life: </b>") + outputView.schoolLifeRecommend() + "\n");
            } if (outputView.scifiRecommend() != "") {
                recommendationOutput.append(Html.fromHtml("<b>Sci-Fi: </b>") + outputView.scifiRecommend() + "\n");
            }
        }
    }

    //returns an error
    public String errorReturn(){
        String error1 = "There is no genre selected. Please select at least one genre and try again.";
        return error1;
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