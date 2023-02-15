package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movies =  movieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining(" ! ","", ""));

        System.out.println(movies);

        //Zadanie dodatkowe

        Factorial factorial = new Factorial();
        factorial.Factorial(7);




    }
}
