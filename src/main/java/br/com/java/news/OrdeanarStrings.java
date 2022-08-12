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

        Comparator<String> comparador = new ComparadorPorTamnho();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        palavras.sort(comparador);
        System.out.println(palavras);

        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);

    }
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamnho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}

