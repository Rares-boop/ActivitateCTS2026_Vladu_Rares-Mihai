package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Bara implements IComponenta{
    private String codCuloare;

    public Bara(String codCuloare) {
        this.codCuloare = codCuloare;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Bara are codul de culoare ");
        sb.append(this.codCuloare);

        System.out.println(sb.toString());
    }
}
