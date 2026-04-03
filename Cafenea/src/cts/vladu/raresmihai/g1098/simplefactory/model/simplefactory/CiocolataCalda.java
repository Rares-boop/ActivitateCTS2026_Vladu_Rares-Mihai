package cts.vladu.raresmihai.g1098.simplefactory.model.simplefactory;

import cts.vladu.raresmihai.g1098.simplefactory.model.prototype.IClonare;

public class CiocolataCalda extends BauturaAbstracta implements Bautura, IClonare {

    public CiocolataCalda() {
    }

    public CiocolataCalda(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        StringBuilder sb = new StringBuilder("Ciocolata calda ");
        sb.append(super.toString()).append("se prepara");

        System.out.println(sb.toString());
    }

    @Override
    public Bautura cloneazaBautura() {
        CiocolataCalda newCiocolataCalda = new CiocolataCalda();
        newCiocolataCalda.nume = super.nume;
        newCiocolataCalda.volum = super.volum;
        newCiocolataCalda.pret = super.pret;

        return newCiocolataCalda;
    }
}
