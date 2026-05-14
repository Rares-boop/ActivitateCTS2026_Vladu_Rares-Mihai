package ro.ase.cts.adapter.clase.adapterspital;

import ro.ase.cts.adapter.clase.aplicatiefarmacie.MedicamentFarmacie;
import ro.ase.cts.adapter.clase.aplicatiespital.MedicamentSpital;

public class AdapterMedicament implements MedicamentFarmacie {
    private MedicamentSpital medicament;

    public AdapterMedicament(MedicamentSpital medicament) {
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        this.medicament.achizitioneazaMedicament();
    }
}
