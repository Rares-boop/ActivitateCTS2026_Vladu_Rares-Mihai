package cts.vladu.raresmihai.g1098.simplefactory.model;

public class Asistent implements IPersonal{
    private String nume;
    private double salariu;

    public Asistent(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
