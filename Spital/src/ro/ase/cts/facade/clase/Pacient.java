package ro.ase.cts.facade.clase;

public class Pacient {
    private String nume;
    private int gravitateStare;

    public Pacient(String nume, int gravitateStare) {
        this.nume = nume;
        this.gravitateStare = gravitateStare;
    }

    public String getNume() {
        return nume;
    }

    public int getGravitateStare() {
        return gravitateStare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gravitateStare=").append(gravitateStare);
        sb.append('}');
        return sb.toString();
    }
}
