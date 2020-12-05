package com.example.l8anime;

public class Recommendations {
    private Genre_Action[] action;
    private Genre_Music[] music;
    private Genre_Drama[] drama;
    private Genre_Horror[] horror;
    private Genre_Mystery[] mystery;
    private Genre_Romance[] romance;
    private Genre_SchoolLife[] schoolLife;
    private Genre_Scifi[] scifi;
    private PreviousResults[] previous;

    public String errorReturn(){
        String error1 = "There is no genre selected. Please select at least one genre and try again.";
        return error1;
    }

}
