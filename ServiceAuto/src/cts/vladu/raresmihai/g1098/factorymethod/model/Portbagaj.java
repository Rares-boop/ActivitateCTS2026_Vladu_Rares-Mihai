package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Portbagaj implements IComponenta{
    double capacitateLitri;

    public Portbagaj(double capacitateLitri) {
        this.capacitateLitri = capacitateLitri;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Portbagajul are capacitatea de ");
        sb.append(this.capacitateLitri);

        System.out.println(sb.toString());
    }
}
