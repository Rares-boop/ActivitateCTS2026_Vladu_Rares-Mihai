package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Structura departamentMedicina = new Departament("Departament medicina ");
        Structura departamentManagement = new Departament("Management ");

        Structura departamentCalculatoare = new Departament("Calculatoare ");

        departamentManagement.adaugaNod(departamentMedicina);
        departamentManagement.adaugaNod(departamentCalculatoare);

        departamentMedicina.adaugaNod(new Sectie("Sectie chirurgie "));
        departamentMedicina.adaugaNod(new Sectie("Sectie garda "));

        departamentCalculatoare.adaugaNod(new Sectie("Mentenanta "));

        departamentManagement.printeaza();
        departamentManagement.stergeNod(departamentMedicina);

        System.out.println("Structura noua ");
        departamentManagement.printeaza();

        System.out.println("Continut departament ");
        departamentCalculatoare.getNodCopil().printeaza();
    }
}
