package com.lambdaschool.solution;

public class BaseballAthleteCreationImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport + " Athlete");
    }
}
