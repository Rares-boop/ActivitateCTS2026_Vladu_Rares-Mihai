package ro.ase.cts.builder01.clase;

public class InternareBuilder implements AbstractBuilder {
    private Internare internare;

    public InternareBuilder(String numePacient) {
        this.internare = new Internare(numePacient, false, false,
                false, false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNumePacient(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejun(boolean micDejun) {
        this.internare.setMicDejun(micDejun);
        return this;
    }

    @Override
    public AbstractBuilder setPapuciCamera(boolean papuciCamera) {
        this.internare.setPapuciCamera(papuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setHalatInterior(boolean halatInterior) {
        this.internare.setHalatInterior(halatInterior);
        return this;
    }
}

