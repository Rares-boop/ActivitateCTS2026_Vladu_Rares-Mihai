package cts.vladu.raresmihai.g1098.builder.model;

public class Podea {
    private boolean esteSpeciala;
    private int gradDuritate;

    public Podea(boolean esteSpeciala, int gradDuritate) {
        this.esteSpeciala = esteSpeciala;
        this.gradDuritate = gradDuritate;
    }

    public boolean isEsteSpeciala() {
        return esteSpeciala;
    }

    public int getGradDuritate() {
        return gradDuritate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Podea{");
        sb.append("esteSpeciala=").append(esteSpeciala);
        sb.append(", gradDuritate=").append(gradDuritate);
        sb.append('}');
        return sb.toString();
    }
}
