package ro.ase.cts.simplefactory.clase;

public class SupaLegume extends Supa{

    public SupaLegume(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append(super.toString());

        return sb.toString();
    }
}
