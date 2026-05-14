package ro.ase.cts.adapter.clase.aplicatiefarmacie;

public class Medicament implements MedicamentFarmacie {
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Se cumpara medicament de la farmacie ");
    }
}
