package ro.ase.cts.builder01.main;

import ro.ase.cts.builder01.clase.AbstractBuilder;
import ro.ase.cts.builder01.clase.Internare;
import ro.ase.cts.builder01.clase.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Program {
    public static void main(String[] args){
        System.out.println("DA");

        Internare internare = new Internare("Dasu", true, true,
                true, true);

        Internare internare1 = new Internare();

        internare1.setNumePacient("Pacient pa pa");
        internare1.setPapuciCamera(true);

        AbstractBuilder abstractBuilder = new InternareBuilder("Pa pa");
        Internare internare2 = abstractBuilder.setHalatInterior(true).build();
        Internare internare3 = abstractBuilder.setHalatInterior(true).setPapuciCamera(true)
                        .setNumePacient("Altul ").build();

        AbstractBuilder02 abstractBuilder1 = new InternareBuilder02();
        abstractBuilder1.setMicDejun(true);

        ro.ase.cts.builder02.Internare internare4 = abstractBuilder1.setHalatInterior(true).setMicDejun(true)
                        .build("New builder");
        ro.ase.cts.builder02.Internare internare5 = abstractBuilder1.setPatRabatabil(true).setPapuciCamera(true)
                        .build("New builder again");

        System.out.println(internare);
        System.out.println(internare1);
        System.out.println(internare2);
        System.out.println(internare3);
        System.out.println(internare4);
        System.out.println(internare5);
    }
}
