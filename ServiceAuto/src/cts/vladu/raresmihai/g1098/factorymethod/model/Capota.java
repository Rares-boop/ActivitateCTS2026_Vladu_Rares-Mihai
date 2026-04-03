package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Capota implements IComponenta{
    private double dimensiune;

    public Capota(double dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Capota cu dimensiune ");
        sb.append(this.dimensiune);

        System.out.println(sb.toString());
    }
}
