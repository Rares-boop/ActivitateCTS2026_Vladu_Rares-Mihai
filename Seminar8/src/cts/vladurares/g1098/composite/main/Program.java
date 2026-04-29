package cts.vladurares.g1098.composite.main;

import cts.vladurares.g1098.composite.clase.Departament;
import cts.vladurares.g1098.composite.clase.Sectie;
import cts.vladurares.g1098.composite.clase.Structura;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Structura spital = new Departament("spital");
        Structura departamentAdministrativ = new Departament("Administrativ");

        Structura secretariat = new Sectie("Secretariat", 20);
        Structura management = new Sectie("Management", 50);

        ((Departament)spital).adaugaStructura(departamentAdministrativ);
        ((Departament)spital).adaugaStructura(management);

        ((Departament)departamentAdministrativ).adaugaStructura(secretariat);
        spital.printeazaDetaliiStructura("");

        ((Departament)spital).stergeStructura(management);
        ((Departament)departamentAdministrativ).adaugaStructura(management);

        spital.printeazaDetaliiStructura("");
    }
}
