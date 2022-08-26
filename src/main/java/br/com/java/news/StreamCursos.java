package br.com.java.news;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}

public class StreamCursos {

    public static void main(String[] args) {
        List<Curso> cusros = new ArrayList<>();
        cusros.add(new Curso("Kotlin", 45));
        cusros.add(new Curso("JavaScript", 150));
        cusros.add(new Curso("Java 8", 190));
        cusros.add(new Curso("C#", 10));

        cusros.sort(Comparator.comparing(Curso::getAlunos));
        cusros.forEach(System.out::println);

        cusros.stream()
                .filter(c -> c.getAlunos() > 100)
                .forEach(c -> System.out.println(c.getNome()));

        cusros.stream()
                .filter(c -> c.getAlunos() > 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        int totalAlunos = cusros.stream()
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(totalAlunos);

        Stream<String> stringStream = cusros.stream().map(Curso::getNome);

        cusros.stream()
                .filter(c -> c.getAlunos() > 10)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        cusros.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);

        cusros.stream()
                .filter(c -> c.getAlunos() > 189)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);

        cusros.stream()
                .filter(c -> c.getAlunos() > 1)
                .collect(Collectors.toMap(
                   c -> c.getNome(),
                   c -> c.getAlunos()
                ))
                .forEach((n, a) -> System.out.println(String.format("%s tem %s alunos ", n, a)));

        cusros.stream()
                .mapToDouble(Curso::getAlunos)
                .max()
                .ifPresent(System.out::println);

        cusros.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst()
                .ifPresent(System.out::println);

    }


}
