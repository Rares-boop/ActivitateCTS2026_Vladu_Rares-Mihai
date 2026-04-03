package ro.ase.cts.simplefactory.clase;

public class SupaVita extends Supa{

    public SupaVita(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append(super.toString());

        return sb.toString();
    }
}
