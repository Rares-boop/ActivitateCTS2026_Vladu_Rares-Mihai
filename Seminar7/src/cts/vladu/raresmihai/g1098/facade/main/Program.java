package cts.vladu.raresmihai.g1098.facade.main;

import cts.vladu.raresmihai.g1098.facade.clase.Medic;
import cts.vladu.raresmihai.g1098.facade.clase.Pacient;
import cts.vladu.raresmihai.g1098.facade.clase.ReceptieSpital;
import cts.vladu.raresmihai.g1098.facade.clase.Salon;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Pacient pacient = new Pacient("Pacient", 6);

        Medic medic = new Medic();
        Salon salon = new Salon();

        if(medic.areTrimitere(pacient)){
            int patLiber = salon.getPatLiber();

            if(patLiber > -1){
                System.out.println("Pacient internat ");
                salon.ocupaPat(patLiber);
            }
        }

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);

        receptieSpital.interneazaPacient(new Pacient("Pacient nou ", 7));
        receptieSpital.interneazaPacient(new Pacient("Alt pacient ", -1));

        receptieSpital.interneazaPacient(new Pacient("Pacient venit ", -1));
        receptieSpital.interneazaPacient(new Pacient("Pacient spital ", 8));
    }
}
