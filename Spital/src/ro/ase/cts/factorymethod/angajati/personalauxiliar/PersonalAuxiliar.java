package ro.ase.cts.factorymethod.angajati.personalauxiliar;

import ro.ase.cts.factorymethod.angajati.IAngajat;

public abstract class PersonalAuxiliar implements IAngajat {
    private String nume;
    private String domeniu;

    public PersonalAuxiliar(String nume, String domeniu) {
        this.nume = nume;
        this.domeniu = domeniu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", domeniu='").append(domeniu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
