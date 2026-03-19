package ro.ase.cts.factorymethod.clase.desert;

public class Clatite extends Desert{
    public Clatite(double grama, double pret, double calorii) {
        super(grama, pret, calorii);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder("Clatite cu ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
