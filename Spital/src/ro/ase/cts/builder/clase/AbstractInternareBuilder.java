package ro.ase.cts.builder.clase;

public interface AbstractInternareBuilder {
    Internare build(String nume);
    AbstractInternareBuilder setArePatRabatabil(boolean arePatRabatabil);
    AbstractInternareBuilder setAreMicDejunInclus(boolean areMicDejunInclus);
    AbstractInternareBuilder setArePapuciCamera(boolean arePapuciCamera);
    AbstractInternareBuilder setAreHalatInterior(boolean areHalatInterior);
}
