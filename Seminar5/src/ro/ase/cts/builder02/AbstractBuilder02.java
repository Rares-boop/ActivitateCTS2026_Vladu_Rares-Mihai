package ro.ase.cts.builder02;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder02 setMicDejun(boolean micDejun);
    AbstractBuilder02 setPapuciCamera(boolean papuciCamera);
    AbstractBuilder02 setHalatInterior(boolean halatInterior);
}

