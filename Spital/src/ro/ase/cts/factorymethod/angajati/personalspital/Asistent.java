package ro.ase.cts.factorymethod.angajati.personalspital;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void descriere() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}

