package ro.ase.cts.prototype.clase;

public class Reteta implements RetetaAbstracta{
    private String numeReteta;
    private double cantitateMgParacetamol;
    private double cantitateMgIbuprofen;
    private int mgVitaminaK;
    private int mgVitaminaA;
    private int nrInregistrare;

    public Reteta() {
    }

    public Reteta(String numeReteta, double cantitateMgParacetamol, double cantitateMgIbuprofen,
                  int mgVitaminaK, int mgVitaminaA, int nrInregistrare) {
        this.numeReteta = numeReteta;
        if(cantitateMgParacetamol < 5 || cantitateMgParacetamol > 200){
            this.cantitateMgParacetamol = 150;
        }
        else{
            this.cantitateMgParacetamol = cantitateMgParacetamol;
        }
        if(cantitateMgIbuprofen < 2.2 || cantitateMgIbuprofen > 120.5){
            this.cantitateMgIbuprofen = 110;
        }
        else{
            this.cantitateMgIbuprofen = cantitateMgIbuprofen;
        }
        if(mgVitaminaK < 50 || mgVitaminaK > 200){
            this.mgVitaminaK = 150;
        }
        else{
            this.mgVitaminaK = mgVitaminaK;
        }
        if(mgVitaminaA < 100 || mgVitaminaA > 500){
            this.mgVitaminaA = 350;
        }
        else{
            this.mgVitaminaA = mgVitaminaA;
        }
        this.nrInregistrare = nrInregistrare;
    }

    public void setNumeReteta(String numeReteta) {
        this.numeReteta = numeReteta;
    }

    public void setCantitateMgParacetamol(double cantitateMgParacetamol) {
        if(cantitateMgParacetamol < 5 || cantitateMgParacetamol > 200){
            this.cantitateMgParacetamol = 150;
        }
        else{
            this.cantitateMgParacetamol = cantitateMgParacetamol;
        }
    }

    public void setCantitateMgIbuprofen(double cantitateMgIbuprofen) {
        if(cantitateMgIbuprofen < 2.2 || cantitateMgIbuprofen > 120.5){
            this.cantitateMgIbuprofen = 110;
        }
        else{
            this.cantitateMgIbuprofen = cantitateMgIbuprofen;
        }
    }

    public void setMgVitaminaK(int mgVitaminaK) {
        if(mgVitaminaK < 50 || mgVitaminaK > 200){
            this.mgVitaminaK = 150;
        }
        else{
            this.mgVitaminaK = mgVitaminaK;
        }
    }

    public void setMgVitaminaA(int mgVitaminaA) {
        if(mgVitaminaA < 100 || mgVitaminaA > 500){
            this.mgVitaminaA = 350;
        }
        else{
            this.mgVitaminaA = mgVitaminaA;
        }
    }

    public void setNrInregistrare(int nrInregistrare) {
        this.nrInregistrare = nrInregistrare;
    }

    @Override
    public RetetaAbstracta produceReteta() {
        Reteta newReteta = new Reteta();
        newReteta.numeReteta = this.numeReteta;
        newReteta.cantitateMgParacetamol = this.cantitateMgParacetamol;
        newReteta.cantitateMgIbuprofen = this.cantitateMgIbuprofen;
        newReteta.mgVitaminaK = this.mgVitaminaK;
        newReteta.mgVitaminaA = this.mgVitaminaA;
        newReteta.nrInregistrare = this.nrInregistrare;

        return newReteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeReteta='").append(numeReteta).append('\'');
        sb.append(", cantitateMgParacetamol=").append(cantitateMgParacetamol);
        sb.append(", cantitateMgIbuprofen=").append(cantitateMgIbuprofen);
        sb.append(", mgVitaminaK=").append(mgVitaminaK);
        sb.append(", mgVitaminaA=").append(mgVitaminaA);
        sb.append(", nrInregistrare=").append(nrInregistrare);
        sb.append('}');
        return sb.toString();
    }
}
