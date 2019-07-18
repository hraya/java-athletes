package com.lambdaschool.solution;

public class TrackAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport + " Runner");
    }
}
