package cts.vladu.raresmihai.g1098.command.clase;

public class Plecare implements Command{
    private Autobuz autobuz;
    private int nrLinie;

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void plecareInCursa() {
        this.autobuz.porneste(this.nrLinie);
    }
}
