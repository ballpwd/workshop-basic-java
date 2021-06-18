package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random7 extends Random {
    @Override
    public int nextInt() {
        return 7;
    }
}

class GererateUUIDTest {

    @Test
    public void getUUID(){
        GererateUUID gererateUUID = new GererateUUID();
        gererateUUID.setRandom(new Random7());
        String uuid = gererateUUID.get("puwadech");
        assertEquals("XYZpuwadech7",uuid);
    }
}