package ro.ase.cts.builder01.clase;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejun(boolean micDejun);
    AbstractBuilder setPapuciCamera(boolean papuciCamera);
    AbstractBuilder setHalatInterior(boolean halatInterior);
}
