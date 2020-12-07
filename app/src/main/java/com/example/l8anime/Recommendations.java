package com.example.l8anime;

import java.util.Random;

public class Recommendations {
    Genre_Action action = new Genre_Action();
    Genre_Drama drama = new Genre_Drama();
    Genre_Horror horror = new Genre_Horror();
    Genre_Music music = new Genre_Music();
    Genre_Mystery mystery = new Genre_Mystery();
    Genre_Romance romance = new Genre_Romance();
    Genre_SchoolLife schoolLife = new Genre_SchoolLife();
    Genre_Scifi scifi = new Genre_Scifi();
    MainActivity switches = new MainActivity();
    int actionNumberGenerated = 0;
    int selectedNums = 0;
    String actionTitle1 = null;
    private Random rng = new Random();
    private PreviousResults previous;

    public void setSelectedNums(int selectedNums){
        this.selectedNums = selectedNums;
    }

    public void actionRecommend(){
        if((selectedNums & MainActivity.ACTION_BIT) == MainActivity.ACTION_BIT) {
            //User included Action Genre

            //attempting to access the array's size so we can have a dynamically changing size and not worry about not including some results because of restraints
            //after accessing the array size, generate a random number for a recommendation
            actionNumberGenerated = getRandNum(action.titlesA.size(), 0);
            previous.getAction()[0] = actionNumberGenerated;
            actionTitle1 = action.titlesA.get(actionNumberGenerated);
//            outputs.outputView.setText(actionTitle1);
        }
    }

    public void dramaRecommend(){
        if((selectedNums & MainActivity.DRAMA_BIT) == MainActivity.DRAMA_BIT) {
            getRandNum(drama.titlesD.size(), 0);
        }
    }

    public void horrorRecommend(){
        if((selectedNums & MainActivity.HORROR_BIT) == MainActivity.HORROR_BIT) {
            getRandNum(horror.titlesH.size(), 0);
        }
    }

    public void musicRecommend() {
        if ((selectedNums & MainActivity.MUSIC_BIT) == MainActivity.MUSIC_BIT) {
            getRandNum(music.titlesMu.size(), 0);
        }
    }
    public void mysteryRecommend() {
        if ((selectedNums & MainActivity.MYSTERY_BIT) == MainActivity.MYSTERY_BIT) {
            getRandNum(mystery.titlesMy.size(), 0);
        }
    }

    public void romanceRecommend() {
        if ((selectedNums & MainActivity.ROMANCE_BIT) == MainActivity.ROMANCE_BIT) {
            getRandNum(romance.titlesR.size(), 0);
        }
    }
    public void schoolLifeRecommend() {
        if ((selectedNums & MainActivity.SCHOOLLIFE_BIT) == MainActivity.SCHOOLLIFE_BIT) {
            getRandNum(schoolLife.titlesSL.size(), 0);
        }
    }

    public void scifiRecommend() {
        if ((selectedNums & MainActivity.SCIFI_BIT) == MainActivity.SCIFI_BIT) {
            getRandNum(scifi.titlesSF.size(), 0);
        }
    }

    //Generates a random number based on ArrayList sizes to retrieve a title
    public int getRandNum(int max, int min){
        int randNum = rng.nextInt(max - min + 1) + min;
        return randNum;
    }


}
