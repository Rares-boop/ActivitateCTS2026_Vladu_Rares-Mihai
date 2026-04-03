package cts.vladu.raresmihai.g1098.singleton.model;

public abstract class AMasina {
    protected String model;
    protected int nrRoti;

    public AMasina(String model, int nrRoti) {
        this.model = model;
        this.nrRoti = nrRoti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("model='").append(model).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append('}');
        return sb.toString();
    }
}
