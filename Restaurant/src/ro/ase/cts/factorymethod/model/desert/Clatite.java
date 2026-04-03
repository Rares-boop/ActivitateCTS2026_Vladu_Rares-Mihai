package ro.ase.cts.factorymethod.model.desert;

public class Clatite extends Desert{

    public Clatite(double nrCalorii, double pret) {
        super(nrCalorii, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Clatite ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
