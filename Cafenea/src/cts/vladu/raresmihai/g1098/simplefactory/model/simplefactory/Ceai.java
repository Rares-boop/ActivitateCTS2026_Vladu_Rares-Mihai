package cts.vladu.raresmihai.g1098.simplefactory.model.simplefactory;

import cts.vladu.raresmihai.g1098.simplefactory.model.prototype.IClonare;

public class Ceai extends BauturaAbstracta implements Bautura, IClonare {

    public Ceai() {
    }

    public Ceai(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        StringBuilder sb = new StringBuilder("Ceai ");
        sb.append(super.toString()).append("se prepara");

        System.out.println(sb.toString());
    }

    @Override
    public Bautura cloneazaBautura() {
        Ceai newCeai = new Ceai();
        newCeai.nume = super.nume;
        newCeai.volum = super.volum;
        newCeai.pret = super.pret;

        return newCeai;
    }
}
