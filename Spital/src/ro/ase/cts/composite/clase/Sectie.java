package ro.ase.cts.composite.clase;

public class Sectie implements Structura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void printeaza() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }

    @Override
    public void adaugaNod(Structura nod) {
        throw new RuntimeException("Sectia nu are subdepartamente ");
    }

    @Override
    public void stergeNod(Structura nod) {
        throw new RuntimeException("Sectia nu are subdepartamente ");
    }

    @Override
    public Structura getNodCopil() {
        throw new RuntimeException("Sectia nu are subdepartamente ");
    }

}
