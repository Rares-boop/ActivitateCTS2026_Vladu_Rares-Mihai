package ro.ase.cts.observer.clase;

public class Spital extends Observabil{
    private Stare stareProblema;

    public Spital() {
        super();
        this.stareProblema = Stare.BINE;
    }

    public void modificaStare(Stare stare){
        this.stareProblema = stare;
        super.notificareObservatori();
    }

    public void apareProblema(Stare stare){
        this.modificaStare(stare);
    }
}
