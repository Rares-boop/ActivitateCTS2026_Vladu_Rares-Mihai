package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Observer pacient = new Pacient("Pacient ");
        Observer newPacient = new Pacient("Pacient nou ");

        Observabil spital = new Spital();

        ((Spital) spital).abonareObservator(pacient);
        ((Spital)spital).apareProblema(Stare.PROBLEMA);

        System.out.println("Schimbare stare ");

        ((Spital) spital).abonareObservator(newPacient);
        ((Spital) spital).apareProblema(Stare.BINE);

    }
}
