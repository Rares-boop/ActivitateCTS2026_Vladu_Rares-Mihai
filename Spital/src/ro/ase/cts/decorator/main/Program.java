package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.DecoratorRezultatAbstract;
import ro.ase.cts.decorator.clase.DecoratorRezultatOnline;
import ro.ase.cts.decorator.clase.Rezultat;
import ro.ase.cts.decorator.clase.RezultatAbstract;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        RezultatAbstract rezultat = new Rezultat(5, "Pacient ");
        RezultatAbstract newRezultat = new Rezultat(6, "Alt pacient ");

        rezultat.printeaza();
        newRezultat.printeaza();

        RezultatAbstract decoratorRezultat = new DecoratorRezultatOnline(rezultat);
        decoratorRezultat.printeaza();

        RezultatAbstract newDecoratorRezultat = new DecoratorRezultatOnline(newRezultat);
        newDecoratorRezultat.printeaza();
    }
}
