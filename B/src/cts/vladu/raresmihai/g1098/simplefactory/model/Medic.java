package cts.vladu.raresmihai.g1098.simplefactory.model;

public class Medic implements IPersonal{
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
