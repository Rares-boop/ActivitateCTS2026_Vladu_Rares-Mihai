package ro.ase.cts.factorymethod.model.supe;

public class SupaLegume extends Supa{

    public SupaLegume(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Supa legume ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
