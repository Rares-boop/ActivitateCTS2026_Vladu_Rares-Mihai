package ro.ase.cts.builder.clase;

public interface AbstractAutobuzLinieBuilder {
    AutobuzLinie build();
    AbstractAutobuzLinieBuilder setOpresteCapat(boolean opresteCapat);
    AbstractAutobuzLinieBuilder setDeschideUsiNesolicitat(boolean deschideUsiNesolicitat);
    AbstractAutobuzLinieBuilder setTextAfisat(String textAfisat);
}
