package com.lambdaschool.solution;

public class HockeyAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport + " Goalie");
    }
}
