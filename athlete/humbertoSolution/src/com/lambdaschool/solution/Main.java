package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        String runner = "Track";
        String goalie = "Hockey";
        String rugby = "Rugby";
        String baseball = "Baseball";

        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(runner);

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(goalie);


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(rugby);

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(baseball);

    }
}
