package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.Internare;
import ro.ase.cts.proxy.clase.InternareAbstract;
import ro.ase.cts.proxy.clase.InternareProxy;
import ro.ase.cts.proxy.clase.Pacient;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Pacient pacient = new Pacient("Pacient ", true);
        Pacient newPacient = new Pacient("Pacient nou ", false);

        InternareAbstract internare = new Internare();
        InternareAbstract internareProxy = new InternareProxy(internare);

        internare.interneaza(pacient);
        internare.interneaza(newPacient);

        internareProxy.interneaza(pacient);
        internareProxy.interneaza(newPacient);
        
    }
}
