package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Internare;
import ro.ase.cts.builder.clase.InternareBuilder;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Internare internare = new InternareBuilder().setAreHalatInterior(true).build("Matei");
        Internare internare1 = new InternareBuilder().setAreHalatInterior(true).setArePapuciCamera(true)
                .setArePatRabatabil(true).setAreMicDejunInclus(true).build("Alt pacient");

        System.out.println(internare);
        System.out.println(internare1);
    }
}
