package ro.ase.cts.factorymethod.clase.desert;

public class Papanasi extends Desert{
    public Papanasi(double grama, double pret, double calorii) {
        super(grama, pret, calorii);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder("Papanasi cu ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
