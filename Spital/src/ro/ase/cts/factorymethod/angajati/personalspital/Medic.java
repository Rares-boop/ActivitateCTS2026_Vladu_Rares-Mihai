package ro.ase.cts.factorymethod.angajati.personalspital;

public class Medic extends PersonalSpital {

    public Medic(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void descriere() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}

