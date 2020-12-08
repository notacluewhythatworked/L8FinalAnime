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

    public String actionRecommend(){
        if((selectedNums & MainActivity.ACTION_BIT) == MainActivity.ACTION_BIT) {
            return action.titlesA.get(getRandNum(action.titlesA.size() - 1, 0));
        }
        return "";
    }

    public String dramaRecommend(){
        if((selectedNums & MainActivity.DRAMA_BIT) == MainActivity.DRAMA_BIT) {
            return drama.titlesD.get(getRandNum(drama.titlesD.size() - 1, 0));
        }
        return "";
    }

    public String horrorRecommend(){
        if((selectedNums & MainActivity.HORROR_BIT) == MainActivity.HORROR_BIT) {
            return horror.titlesH.get(getRandNum(horror.titlesH.size() - 1, 0));
        }
        return "";
    }

    public String musicRecommend() {
        if ((selectedNums & MainActivity.MUSIC_BIT) == MainActivity.MUSIC_BIT) {
            return music.titlesMu.get(getRandNum(music.titlesMu.size() - 1, 0));
        }
        return "";
    }

    public String mysteryRecommend() {
        if ((selectedNums & MainActivity.MYSTERY_BIT) == MainActivity.MYSTERY_BIT) {
            return mystery.titlesMy.get(getRandNum(mystery.titlesMy.size() - 1, 0));
        }
        return "";
    }

    public String romanceRecommend() {
        if ((selectedNums & MainActivity.ROMANCE_BIT) == MainActivity.ROMANCE_BIT) {
            return romance.titlesR.get(getRandNum(romance.titlesR.size() - 1, 0));
        }
        return "";
    }

    public String schoolLifeRecommend() {
        if ((selectedNums & MainActivity.SCHOOLLIFE_BIT) == MainActivity.SCHOOLLIFE_BIT) {
            return schoolLife.titlesSL.get(getRandNum(schoolLife.titlesSL.size() - 1, 0));
        }
        return "";
    }

    public String scifiRecommend() {
        if ((selectedNums & MainActivity.SCIFI_BIT) == MainActivity.SCIFI_BIT) {
            return scifi.titlesSF.get(getRandNum(scifi.titlesSF.size() - 1, 0));
        }
        return "";
    }

    //Generates a random number based on ArrayList sizes to retrieve a title
    public int getRandNum(int max, int min){
        int randNum = rng.nextInt(max - min + 1) + min;
        return randNum;
    }


}
