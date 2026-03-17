package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    @Override
    public ro.ase.cts.builder02.Internare build(String numePacient) {
        return new ro.ase.cts.builder02.Internare(numePacient, patRabatabil, micDejun, papuciCamera, halatInterior);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder02 setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    @Override
    public AbstractBuilder02 setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }
}
