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
    private Random rng = new Random();
    private PreviousResults[] previous;

    public void actionRecommend(){
        if (switches.actionState = true){
            //attempting to access the array's size so we can have a dynamically changing size and not worry about not including some results because of restraints
            //after accessing the array size, generate a random number for a recommendation
            getRandNum(action.action());
        }
    }

    public void dramaRecommend(){
        if(switches.dramaState = true){

        }
    }

    public void horrorRecommend(){
        if(switches.horrorState = true){

        }
    }

    public void musicRecommend(){
        if(switches.musicState = true){

        }
    }

    public void mysteryRecommend(){
        if(switches.mysteryState = true){

        }
    }

    public void romanceRecommend(){
        if(switches.romanceState = true){

        }
    }

    public void schoolLifeRecommend(){
        if(switches.schoolLifeState = true){

        }
    }

    public void scifiRecommend(){
        if(switches.scifiState = true){

        }
    }

    //Generates a random number based on ArrayList sizes to retrieve a title
    public int getRandNum(int max, int min){
        int randNum = rng.nextInt(max - min + 1) + min;
        return randNum;
    }


}
