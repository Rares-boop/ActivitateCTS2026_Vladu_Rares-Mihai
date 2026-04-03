package ro.ase.cts.factorymethod.model.supe;

public class SupaVita extends Supa{

    public SupaVita(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Supa vita ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
