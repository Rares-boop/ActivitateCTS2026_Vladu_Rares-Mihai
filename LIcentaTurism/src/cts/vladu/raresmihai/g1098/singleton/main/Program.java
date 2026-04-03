package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.AbstractToursimLicense;
import cts.vladu.raresmihai.g1098.singleton.model.TourismLicense;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try {
            AbstractToursimLicense licenta = TourismLicense.setLicenseNumber(5, "Licenta", "Astazi");
            AbstractToursimLicense newLicenta = TourismLicense.getInstance();

            AbstractToursimLicense licenta1 = TourismLicense.getInstance();
            AbstractToursimLicense licentaBuna = TourismLicense.getInstance();

            licenta.afiseazaDetalii();
            newLicenta.afiseazaDetalii();

//            AbstractToursimLicense licentaNoua = TourismLicense.setLicenseNumber(6, "Alta Licenta",
//                    "Maine");

            licenta1.afiseazaDetalii();
            licentaBuna.afiseazaDetalii();

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
