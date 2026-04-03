package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.AutobuzLinie;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AutobuzLinie autobuzLinie = new AutobuzLinie.AutobuzBuilder("Mercedes",
                "Matei").setOpresteCapat(true).setDeschideUsiNesolicitat(true)
                .build();
        AutobuzLinie autobuzLinie1 = new AutobuzLinie.AutobuzBuilder("Mercedes",
                "Petre").setOpresteCapat(false).setDeschideUsiNesolicitat(true)
                        .setTextAfisat("linie noua").build();

        System.out.println(autobuzLinie);
        System.out.println(autobuzLinie1);
    }
}
