package cts.vladu.raresmihai.g1098.proxy.clase;

public class Autobuz implements MijlocDeTransport{
    private int nrCalatoriAutobuz;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrCalatoriAutobuz, int nrLinie) {
        this.nrCalatoriAutobuz = nrCalatoriAutobuz;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int nrCalatoriAutobuz, int nrLinie, TipCursa tipCursa) {
        this.nrCalatoriAutobuz = nrCalatoriAutobuz;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    @Override
    public void opresteStatie(Statie statie) {
        System.out.println("Autobuzul linia " + this.nrLinie + " a oprit in statia " + statie.getNume());
    }

    @Override
    public int getNrCalatoriAutobuz() {
        return this.nrCalatoriAutobuz;
    }

    @Override
    public TipCursa getTipCursa() {
        return this.tipCursa;
    }
}
