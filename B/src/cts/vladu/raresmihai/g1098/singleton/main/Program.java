package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.IHospitalService;
import cts.vladu.raresmihai.g1098.singleton.model.PatientNotificationService;

public class Program {
    public static void main(String[] args) {
        System.out.println("Bine");

        IHospitalService hospitalService = PatientNotificationService.getInstance(5, "descriere");
        IHospitalService newHospitalService = PatientNotificationService.getInstance(6, "Alt descriere");

        hospitalService.startService();
        newHospitalService.startService();
    }
}
