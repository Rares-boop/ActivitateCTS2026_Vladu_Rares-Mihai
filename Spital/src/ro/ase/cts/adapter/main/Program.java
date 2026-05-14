package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.clase.adapterspital.AdapterMedicament;
import ro.ase.cts.adapter.clase.aplicatiefarmacie.MedicamentFarmacie;
import ro.ase.cts.adapter.clase.aplicatiespital.Medicament;
import ro.ase.cts.adapter.clase.aplicatiespital.MedicamentSpital;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        MedicamentSpital medicamentSpital = new Medicament("AB 6753");
        MedicamentFarmacie medicamentFarmacie = new ro.ase.cts.adapter.clase.aplicatiefarmacie.Medicament("Medicament");

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        MedicamentFarmacie medicament = new AdapterMedicament(new Medicament("Medicament bun"));
        medicament.cumparaMedicament();

        MedicamentFarmacie newMedicament =  new AdapterMedicament(new Medicament("AB 7432"));
        newMedicament.cumparaMedicament();
    }
}
