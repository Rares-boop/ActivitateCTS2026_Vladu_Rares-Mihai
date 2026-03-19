package ro.ase.cts.factorymethod.clase.supe;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(double gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder("Supa ciuperci cu ");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
