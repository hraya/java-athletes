package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private Athlete athlete;

    public MyApplication(Athlete athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete(String sport)
    {
        System.out.println("************");
        athlete.displayAthlete(sport);
        System.out.println("************\n");
    }
}
