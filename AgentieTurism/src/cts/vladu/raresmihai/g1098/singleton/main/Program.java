package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.AbstractTourismLicense;
import cts.vladu.raresmihai.g1098.singleton.model.TourismLicense;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractTourismLicense tourismLicense = TourismLicense.getInstance("Licenta", 22);
        AbstractTourismLicense tourismLicense1 = TourismLicense.getInstance("Licenta noua", 55);

        try{
            tourismLicense.setLicenseNumber(245);
        } catch (RuntimeException e) {
            System.out.println("Exceptie setare numar licenta ");
        }

        System.out.println(tourismLicense);
        System.out.println(tourismLicense1);
    }
}
