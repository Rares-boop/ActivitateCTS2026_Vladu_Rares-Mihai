package cts.vladu.raresmihai.g1098.prototype.main;

import cts.vladu.raresmihai.g1098.prototype.model.IMasina;
import cts.vladu.raresmihai.g1098.prototype.model.ISticker;
import cts.vladu.raresmihai.g1098.prototype.model.Masina;
import cts.vladu.raresmihai.g1098.prototype.model.Sticker;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        IMasina masina = new Masina("Ford", 1999, 2.5, 4);
        ISticker sticker = new Sticker(masina);

        ISticker newSticker = sticker.cloneaza();
        ((Sticker)newSticker).setPret(10);

        System.out.println(sticker);
        System.out.println(newSticker);
    }
}
