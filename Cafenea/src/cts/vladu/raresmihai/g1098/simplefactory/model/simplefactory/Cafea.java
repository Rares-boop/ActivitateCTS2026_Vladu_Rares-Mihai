package cts.vladu.raresmihai.g1098.simplefactory.model.simplefactory;

import cts.vladu.raresmihai.g1098.simplefactory.model.prototype.IClonare;

public class Cafea extends BauturaAbstracta implements Bautura, IClonare {

    public Cafea() {
    }

    public Cafea(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        StringBuilder sb = new StringBuilder("Cafea ");
        sb.append(super.toString()).append("se prepara");

        System.out.println(sb.toString());
    }

    @Override
    public Bautura cloneazaBautura() {
        Cafea newCafea = new Cafea();
        newCafea.nume = super.nume;
        newCafea.volum = super.volum;
        newCafea.pret = super.pret;

        return newCafea;
    }
}
