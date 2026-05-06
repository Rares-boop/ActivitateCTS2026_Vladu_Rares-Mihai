package cts.vladu.raresmihai.g1098.command.main;

import cts.vladu.raresmihai.g1098.command.clase.Autobuz;
import cts.vladu.raresmihai.g1098.command.clase.Command;
import cts.vladu.raresmihai.g1098.command.clase.Operator;
import cts.vladu.raresmihai.g1098.command.clase.Plecare;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Operator operator = new Operator();
        Command comanda = new Plecare(new Autobuz("Autobuz", "Mercedes"), 134);

        Command newComanda = new Plecare(new Autobuz("Alt autobuz", "Mercedes"), 567);
        Command comanda1 = new Plecare(new Autobuz("Autobuz nou", "Model "), 724);

        operator.adaugaComanda(comanda);
        operator.executaComanda();

        operator.adaugaComanda(newComanda);
        operator.adaugaComanda(comanda1);

        operator.executaComanda();
        operator.executaComanda();

        operator.executaComanda();
        operator.executaComanda();
    }
}
