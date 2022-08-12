package br.com.java.news;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdeanarStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("casa");
        palavras.add("carros");
        palavras.add("motocas");
        palavras.add("barco");
        palavras.add("flavio santana");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(palavras);
        palavras.forEach((palavra) -> System.out.println(palavra));

    }
}
