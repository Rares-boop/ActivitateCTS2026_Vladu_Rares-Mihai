package ro.ase.cts.factorymethod.angajati.personalspital;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void descriere() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}


