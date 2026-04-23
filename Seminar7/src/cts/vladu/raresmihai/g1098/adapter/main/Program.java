package cts.vladu.raresmihai.g1098.adapter.main;

import cts.vladu.raresmihai.g1098.adapter.clase.adaptermedicamente.AdapterMedicamente;
import cts.vladu.raresmihai.g1098.adapter.clase.aplicatiespital.Medicament;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Medicament medicament = new Medicament("KA817", 20);
        cts.vladu.raresmihai.g1098.adapter.clase.aplicatiefarmacie.Medicament newMedicament = new cts.vladu.raresmihai.g1098.adapter.clase.aplicatiefarmacie.Medicament("Medicament");

        medicament.achizitioneazaMedicament();
        newMedicament.cumparaMedicament();

        AdapterMedicamente adapterMedicamente = new AdapterMedicamente(medicament);
        adapterMedicamente.cumparaMedicament();

        procurareMedicament(newMedicament);
        procurareMedicament(adapterMedicamente);

        newMedicament.cumparaMedicament();
        adapterMedicamente.cumparaMedicament();
    }

    public static void procurareMedicament(cts.vladu.raresmihai.g1098.adapter.clase.aplicatiefarmacie.Medicament medicament){
            medicament.cumparaMedicament();
    }
}
