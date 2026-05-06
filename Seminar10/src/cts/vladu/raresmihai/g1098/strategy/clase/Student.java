package cts.vladu.raresmihai.g1098.strategy.clase;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(String nume, ModSustinere modSustinere) {
        this.nume = nume;
        this.modSustinere = modSustinere;
    }

    public Student() {
        this.nume = "";
        this.modSustinere = new ProbaScrisa();
    }

    public void setModSustinere(ModSustinere modSustinere){
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        this.modSustinere.sustineExamen();
    }
}
