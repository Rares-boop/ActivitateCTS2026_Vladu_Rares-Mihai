package ro.ase.cts.adapter.clase.aplicatiespital;

public class Medicament implements MedicamentSpital{
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    @Override
    public void achizitioneazaMedicament() {
        if(this.prezintaReteta()){
            System.out.println("Se achizitioneaza medicamentul ");
        }
        else{
            System.out.println("Pentru acest medicament este nevoie de reteta ");
        }
    }

    @Override
    public boolean prezintaReteta() {
        return this.nume.startsWith("AB");
    }
}
