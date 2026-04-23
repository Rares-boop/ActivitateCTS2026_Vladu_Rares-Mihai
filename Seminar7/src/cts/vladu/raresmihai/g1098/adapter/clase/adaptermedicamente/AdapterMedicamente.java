package cts.vladu.raresmihai.g1098.adapter.clase.adaptermedicamente;

import cts.vladu.raresmihai.g1098.adapter.clase.aplicatiefarmacie.Medicament;

public class AdapterMedicamente extends Medicament {
    private cts.vladu.raresmihai.g1098.adapter.clase.aplicatiespital.Medicament medicamentSpital;

    public AdapterMedicamente(cts.vladu.raresmihai.g1098.adapter.clase.aplicatiespital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
