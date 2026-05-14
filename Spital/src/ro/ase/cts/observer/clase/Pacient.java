package ro.ase.cts.observer.clase;

public class Pacient implements Observer{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare() {
        StringBuilder sb = new StringBuilder("Pacientul ");
        sb.append(this.nume).append(" este anuntat ");

        System.out.println(sb.toString());
    }
}
