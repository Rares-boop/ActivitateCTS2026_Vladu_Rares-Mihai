package ro.ase.cts.simplefactory.clase;

public class SupaCiuperci extends Supa{

    public SupaCiuperci(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append(super.toString());

        return sb.toString();
    }
}
