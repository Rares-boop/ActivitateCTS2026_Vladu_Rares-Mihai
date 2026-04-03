package cts.vladu.raresmihai.g1098.simplefactory.model;

public class SUV extends AMasina{
    private double inaltime;

    public SUV(String model, int nrRoti, double inaltime) {
        super(model, nrRoti);
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SUV{");
        sb.append(super.toString());
        sb.append("inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
