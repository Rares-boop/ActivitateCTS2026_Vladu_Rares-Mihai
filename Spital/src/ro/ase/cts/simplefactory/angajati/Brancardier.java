package ro.ase.cts.simplefactory.angajati;

public class Brancardier extends PersonalSpital{
    private int varsta;


    public Brancardier(String nume, double salariu, int varsta) {
        super(nume, salariu);
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString());
        sb.append("varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
