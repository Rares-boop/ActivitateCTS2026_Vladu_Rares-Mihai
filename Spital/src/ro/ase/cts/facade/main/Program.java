package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Medic;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.ReceptieSpital;
import ro.ase.cts.facade.clase.Salon;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Pacient pacient = new Pacient("Pacient ", 6);

        Medic medic = new Medic();
        Salon salon = new Salon();

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);

        receptieSpital.interneazaPacient(pacient);
        receptieSpital.interneazaPacient(new Pacient("Pacient bun ", -1));

        receptieSpital.interneazaPacient(new Pacient("Alt pacient ", 7));
        receptieSpital.interneazaPacient(new Pacient("Pacient spital ", 6));

    }
}
