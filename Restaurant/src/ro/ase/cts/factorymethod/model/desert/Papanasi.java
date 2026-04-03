package ro.ase.cts.factorymethod.model.desert;

public class Papanasi extends Desert{


    public Papanasi(double nrCalorii, double pret) {
        super(nrCalorii, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Papanasi ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
