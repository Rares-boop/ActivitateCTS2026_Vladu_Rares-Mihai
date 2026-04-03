package cts.vladu.raresmihai.g1098.prototype.main;

import cts.vladu.raresmihai.g1098.prototype.model.ISticker;
import cts.vladu.raresmihai.g1098.prototype.model.Masina;
import cts.vladu.raresmihai.g1098.prototype.model.Sticker;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        ISticker sticker = new Sticker(new Masina("Ford", 2025, 5, 2));
        ISticker newSticker = sticker.cloneaza();

        ISticker sticker1 = sticker.cloneaza();
        ISticker stickerBun = sticker.cloneaza();

        System.out.println(sticker);
        System.out.println(newSticker);

        System.out.println(sticker1);
        System.out.println(stickerBun);

    }
}
