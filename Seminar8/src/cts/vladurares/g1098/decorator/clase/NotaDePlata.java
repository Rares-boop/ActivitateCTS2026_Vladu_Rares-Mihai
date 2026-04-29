package cts.vladurares.g1098.decorator.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private double suma;
    private String data;

    public NotaDePlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        final StringBuilder sb = new StringBuilder("NotaDePlata{");
        sb.append("suma=").append(suma);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
