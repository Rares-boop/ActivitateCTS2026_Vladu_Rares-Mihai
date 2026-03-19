package ro.ase.cts.factorymethod.clase.supe;

public class SupaLegume extends Supa {
    public SupaLegume(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder("Supa de legume cu ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
