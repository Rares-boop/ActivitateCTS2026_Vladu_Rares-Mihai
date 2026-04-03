package cts.vladu.raresmihai.g1098.simplefactory.model;

public class SEDAN extends AMasina{
    private double inaltime;

    public SEDAN(String model, int nrRoti, double inaltime) {
        super(model, nrRoti);
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SEDAN{");
        sb.append(super.toString());
        sb.append("inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
