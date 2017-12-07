package com.kodilla.good.patterns.challenges;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        MovieStore allTitles = new MovieStore();
        String theResultStringAllTitles = allTitles.getMovies().entrySet().stream()
                .map(Map.Entry::toString)
                .collect(Collectors.joining("!"));

        System.out.println(theResultStringAllTitles);
    }
}
