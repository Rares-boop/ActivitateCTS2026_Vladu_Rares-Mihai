package ro.ase.cts.factorymethod.angajati.personalspital;

import ro.ase.cts.factorymethod.angajati.IAngajat;

public abstract class PersonalSpital implements IAngajat {
    private String nume;
    private double salariu;

    public PersonalSpital(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}

