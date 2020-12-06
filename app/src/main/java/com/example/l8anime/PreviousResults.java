package com.example.l8anime;

public class PreviousResults {

    private int actionNumberGenerated;
    private int[] action;

    public int[] getAction() {
        return action;
    }

    public PreviousResults() {
        this.action = new int[10];
    }
}
