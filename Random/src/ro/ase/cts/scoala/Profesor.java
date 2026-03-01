package ro.ase.cts.scoala;

import ro.ase.cts.interfaces.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    @Override
    public void preda() {
        System.out.println("Profesorul " + this.idAngajat + " preda");
    }

    @Override
    public String toString() {
        return "[Profesor] " + super.toString() + ", ID: " + this.idAngajat;
    }
}
