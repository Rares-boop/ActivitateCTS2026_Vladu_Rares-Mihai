package ro.ase.cts.factorymethod.angajati.personalauxiliar;

public class Secretar extends PersonalAuxiliar{

    public Secretar(String nume, String domeniu) {
        super(nume, domeniu);
    }

    @Override
    public void descriere() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
