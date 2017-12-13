package com.kodilla.good.patterns.clean;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        MovieStore allTitles = new MovieStore();
        String theResultStringAllTitles = allTitles.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(theResultStringAllTitles);
    }
}
