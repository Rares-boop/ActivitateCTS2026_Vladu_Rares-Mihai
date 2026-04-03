package ro.ase.cts.factorymethod.angajati.personalauxiliar;

public class Regisrator extends PersonalAuxiliar{

    public Regisrator(String nume, String domeniu) {
        super(nume, domeniu);
    }

    @Override
    public void descriere() {
        final StringBuilder sb = new StringBuilder("Regisrator{");
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
