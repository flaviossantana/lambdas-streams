package br.com.java.news;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class OrdeanarStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("carros");
        palavras.add("flavio santana");
        palavras.add("casa");
        palavras.add("motocas");
        palavras.add("barco");

        palavras.forEach(System.out::println);
        System.out.println("----------------------------------------------------");

        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.sort(Comparator.naturalOrder());
        palavras.forEach(System.out::println);
        System.out.println("----------------------------------------------------");

        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);
        System.out.println("----------------------------------------------------");

        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        //returns a list view
        List<String> slistr = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");
        List<String> sortedListr = slistr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedListr.forEach(System.out::println);

    }
}
