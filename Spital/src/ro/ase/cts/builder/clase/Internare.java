package ro.ase.cts.builder.clase;

public class Internare {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    public Internare(String nume, boolean arePatRabatabil, boolean areMicDejunInclus,
                     boolean arePapuciCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    public void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }
}
