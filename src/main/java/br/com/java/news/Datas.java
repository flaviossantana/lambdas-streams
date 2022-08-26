package br.com.java.news;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate copaDoMundo = LocalDate.of(2028, Month.JULY, 17);
        int anosAteACoppa = copaDoMundo.getYear() - hoje.getYear();
        System.out.println(anosAteACoppa);

        Period diferencaEntreDatas = Period.between(hoje, copaDoMundo);
        System.out.println(diferencaEntreDatas);
        System.out.println(diferencaEntreDatas.getYears());
        System.out.println(diferencaEntreDatas.getMonths());
        System.out.println(diferencaEntreDatas.getDays());

        System.out.println(hoje.minusYears(5));
        System.out.println(hoje.minusMonths(10));
        System.out.println(hoje.minusDays(15));

        LocalDate proximaCopa = copaDoMundo.plusYears(4);
        System.out.println(proximaCopa);

        DateTimeFormatter diasMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(copaDoMundo.format(diasMesAno));

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter diaMesAnoHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(agora.format(diaMesAnoHoraMinuto));

        YearMonth natal = YearMonth.of(2022, Month.DECEMBER);
        DateTimeFormatter anoMes = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.println(natal.format(anoMes));

        LocalTime intervalo = LocalTime.of(12, 30);
        System.out.println(intervalo);

    }


}
