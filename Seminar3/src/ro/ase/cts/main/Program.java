package ro.ase.cts.main;

import ro.ase.cts.singleton.Hotel;

public class Program {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("Hotel", 60, 34);
        Hotel pensiune = Hotel.getInstance("HotelNou", 100, 90);

        hotel.rezervaCamera();
        hotel.rezervaCamera();

        pensiune.rezervaCamera();
        pensiune.rezervaCamera();

        hotel.afiseazaDetaliiHotel();
        pensiune.afiseazaDetaliiHotel();

        hotel.afiseazaGradDeOcupare();
    }
}
