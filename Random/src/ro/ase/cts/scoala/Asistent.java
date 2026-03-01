package ro.ase.cts.scoala;

import ro.ase.cts.interfaces.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul " + this.idAsistent + " preda");
    }

    @Override
    public String toString() {
        return "[Asistent] " + super.toString() + ", ID: " + this.idAsistent;
    }
}
