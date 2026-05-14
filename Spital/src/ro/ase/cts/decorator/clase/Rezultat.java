package ro.ase.cts.decorator.clase;

public class Rezultat implements RezultatAbstract{
    private int id;
    private String numePacient;

    public Rezultat(int id, String numePacient) {
        this.id = id;
        this.numePacient = numePacient;
    }

    @Override
    public void printeaza() {
        final StringBuilder sb = new StringBuilder("Rezultat{");
        sb.append("id=").append(id);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }

}
