package cts.vladu.raresmihai.g1098.singleton.model;

public class Masina extends AMasina{
    private int cod;

    public Masina(String model, int nrRoti, int cod) {
        super(model, nrRoti);
        this.cod = cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append(super.toString());
        sb.append("cod=").append(cod);
        sb.append('}');
        return sb.toString();
    }
}
