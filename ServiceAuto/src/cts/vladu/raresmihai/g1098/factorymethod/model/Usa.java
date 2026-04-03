package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Usa implements IComponenta{
    private double pret;

    public Usa(double pret) {
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Usa cu pret ");
        sb.append(this.pret);

        System.out.println(sb.toString());
    }
}
