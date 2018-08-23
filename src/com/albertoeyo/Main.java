package com.albertoeyo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );

        final List<String> gNumbers = new ArrayList<>();

        someBingoNumbers.forEach(bingoNumber -> {
            if (bingoNumber.toUpperCase().startsWith("G")){
                gNumbers.add(bingoNumber);
            }
        });

        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
        gNumbers.forEach(System.out::println);
    }
}
