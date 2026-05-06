package cts.vladu.raresmihai.g1098.strategy.main;

import cts.vladu.raresmihai.g1098.strategy.clase.Grila;
import cts.vladu.raresmihai.g1098.strategy.clase.ProbaOrala;
import cts.vladu.raresmihai.g1098.strategy.clase.ProbaScrisa;
import cts.vladu.raresmihai.g1098.strategy.clase.Student;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Student student = new Student("Student", new ProbaScrisa());

        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new Grila());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();

    }
}
