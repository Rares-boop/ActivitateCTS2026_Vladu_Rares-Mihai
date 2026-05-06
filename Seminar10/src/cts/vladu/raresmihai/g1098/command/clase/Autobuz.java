package cts.vladu.raresmihai.g1098.command.clase;

public class Autobuz {
    private String producatori;
    private String model;

    public Autobuz(String producatori, String model) {
        this.producatori = producatori;
        this.model = model;
    }

    public void porneste(int nrLinie){
        System.out.println("Autobuzul " + this.model + " porneste pe linia " + nrLinie);
    }
}
