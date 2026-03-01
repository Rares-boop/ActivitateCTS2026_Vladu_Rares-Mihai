package ro.ase.cts.main;

import ro.ase.cts.invatare.Curs;
import ro.ase.cts.scoala.Profesor;
import ro.ase.cts.scoala.Student;

public class Program {
    public static void main(String[] args) {
        Curs curs = new Curs("CTS" , 4, new Profesor("Un profesor", 40,
                "1334"));

        curs.addStudent(new Student("Un student", 21, "bfwje"));
        curs.addStudent(new Student("Alt student", 21, "ileug"));

        System.out.println("Curs " + curs.getNumeCurs() + " cu credite " + curs.getNrCredite());
        System.out.println("Profesor " + curs.getProfesor().toString());

        curs.getProfesor().preda();
        for (Student s : curs.getStudenti()) {
            System.out.println(s.toString());
        }
    }
}

