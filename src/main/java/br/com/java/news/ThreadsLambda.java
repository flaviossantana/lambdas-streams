package br.com.java.news;

public class ThreadsLambda {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando Runnable Anonymous");
            }
        }).start();

        new Thread(() -> System.out.println("Executando Runnable Lambda")).start();

    }

}
