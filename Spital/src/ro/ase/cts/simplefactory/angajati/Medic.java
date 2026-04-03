package ro.ase.cts.simplefactory.angajati;

public class Medic extends PersonalSpital{
    private double oreSuplimentare;


    public Medic(String nume, double salariu, double oreSuplimentare) {
        super(nume, salariu);
        this.oreSuplimentare = oreSuplimentare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString());
        sb.append("oreSuplimentare=").append(oreSuplimentare);
        sb.append('}');
        return sb.toString();
    }
}
