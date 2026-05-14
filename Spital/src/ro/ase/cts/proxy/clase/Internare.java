package ro.ase.cts.proxy.clase;

public class Internare implements InternareAbstract{

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " se interneaza ");
    }
}
