package ro.ase.cts.proxy.clase;

public class InternareProxy implements InternareAbstract{
    private InternareAbstract internare;

    public InternareProxy(InternareAbstract internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            this.internare.interneaza(pacient);
        }
        else{
            System.out.println("Pacientul are nevoie de asigurare pentru a se interna ");
        }
    }
}
