package ro.ase.cts.builder.clase;

public class InternareBuilder implements AbstractInternareBuilder{
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    public InternareBuilder() {
        this.arePatRabatabil = false;
        this.areMicDejunInclus =false;
        this.arePapuciCamera = false;
        this.areHalatInterior = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume, arePatRabatabil, areMicDejunInclus, arePapuciCamera,
                areHalatInterior);
    }

    @Override
    public AbstractInternareBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public AbstractInternareBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
        return this;
    }

    @Override
    public AbstractInternareBuilder setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return this;
    }

    @Override
    public AbstractInternareBuilder setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
        return this;
    }
}
