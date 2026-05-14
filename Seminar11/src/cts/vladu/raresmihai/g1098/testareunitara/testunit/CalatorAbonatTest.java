package cts.vladu.raresmihai.g1098.testareunitara.testunit;

import cts.vladu.raresmihai.g1098.observer.clase.CalatorAbonat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalatorAbonatTest {

    @Test
    public void testPlatesteBilet() {
        CalatorAbonat calator = new CalatorAbonat("Calator ");
        calator.setSold(1000);

        calator.platesteBilet(30);
        assertEquals(970, calator.getSold(), 0.01f);
    }

    @Test
    public void testPlatesteBiletInsuficient(){
        CalatorAbonat calator = new CalatorAbonat("Calator ");
        calator.setSold(800);

        calator.platesteBilet(900);
        assertEquals(800, calator.getSold(), 0.01f);
    }
}