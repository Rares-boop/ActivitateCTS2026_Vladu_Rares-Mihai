package cts.vladu.raresmihai.g1098.chain.main;

import cts.vladu.raresmihai.g1098.chain.model.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();

        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieMetrou);

        //calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12));

        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));
    }
}
