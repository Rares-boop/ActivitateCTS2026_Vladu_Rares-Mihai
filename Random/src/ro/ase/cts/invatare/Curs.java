package ro.ase.cts.invatare;

import ro.ase.cts.scoala.Profesor;
import ro.ase.cts.scoala.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int nrCredite;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int nrCredite, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.nrCredite = nrCredite;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return this.numeCurs;
    }

    public int getNrCredite() {
        return this.nrCredite;
    }

    public void addStudent(Student student) {
        this.studenti.add(student);
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public List<Student> getStudenti() {
        return this.studenti;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "numeCurs='" + this.numeCurs + '\'' +
                ", nrCredite=" + this.nrCredite +
                ", profesor=" + this.profesor +
                ", studenti=" + this.studenti +
                '}';
    }
}
