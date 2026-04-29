package cts.vladurares.g1098.composite.clase;

public class Sectie implements Structura{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void printeazaDetaliiStructura(String spatii) {
        final StringBuilder sb = new StringBuilder(spatii);
        sb.append("Sectie nume='").append(nume).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
