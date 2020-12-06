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
    MainActivity2 outputs = new MainActivity2();
    int actionNumberGenerated = 0;
    private Random rng = new Random();
    private PreviousResults previous;

    public void actionRecommend(){
        if (switches.actionState == true){
            //attempting to access the array's size so we can have a dynamically changing size and not worry about not including some results because of restraints
            //after accessing the array size, generate a random number for a recommendation
            actionNumberGenerated = getRandNum(action.titlesA.size(), 0);
            previous.getAction()[0] = actionNumberGenerated;
            action.titlesA.indexOf(actionNumberGenerated);
//            outputs.outputView
        }
    }

    public void dramaRecommend(){
        if(switches.dramaState == true){
            getRandNum(drama.titlesD.size(), 0);

        }
    }

    public void horrorRecommend(){
        if(switches.horrorState == true){
            getRandNum(horror.titlesH.size(), 0);
        }
    }

    public void musicRecommend(){
        if(switches.musicState == true){
            getRandNum(music.titlesMu.size(), 0);
        }
    }

    public void mysteryRecommend(){
        if(switches.mysteryState == true){
            getRandNum(mystery.titlesMy.size(), 0);
        }
    }

    public void romanceRecommend(){
        if(switches.romanceState == true){
            getRandNum(romance.titlesR.size(), 0);
        }
    }

    public void schoolLifeRecommend(){
        if(switches.schoolLifeState == true){
            getRandNum(schoolLife.titlesSL.size(), 0);
        }
    }

    public void scifiRecommend(){
        if(switches.scifiState == true){
            getRandNum(scifi.titlesSF.size(), 0);
        }
    }

    //Generates a random number based on ArrayList sizes to retrieve a title
    public int getRandNum(int max, int min){
        int randNum = rng.nextInt(max - min + 1) + min;
        return randNum;
    }


}
