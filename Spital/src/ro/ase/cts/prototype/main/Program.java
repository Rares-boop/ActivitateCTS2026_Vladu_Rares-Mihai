package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Reteta;
import ro.ase.cts.prototype.clase.RetetaAbstracta;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        RetetaAbstracta reteta = new Reteta("Reteta buna",100, 300, 100,
                100, 254);
        RetetaAbstracta newReteta = reteta.produceReteta();

        ((Reteta)newReteta).setCantitateMgIbuprofen(90);
        ((Reteta)newReteta).setMgVitaminaK(90);

        System.out.println(reteta);
        System.out.println(newReteta);
    }
}
