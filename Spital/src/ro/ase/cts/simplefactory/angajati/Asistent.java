package ro.ase.cts.simplefactory.angajati;

public class Asistent extends PersonalSpital{
    private String sala;


    public Asistent(String nume, double salariu, String sala) {
        super(nume, salariu);
        this.sala = sala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString());
        sb.append("sala='").append(sala).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
