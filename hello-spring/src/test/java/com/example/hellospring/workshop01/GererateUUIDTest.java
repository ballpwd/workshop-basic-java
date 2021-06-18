package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Random7 implements IRandom {
    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

class GererateUUIDTest {

    @Test
    public void getUUID(){
        GererateUUID gererateUUID = new GererateUUID();
        gererateUUID.setRandom(new Random7()); // Dependency Injection (DI)
        String uuid = gererateUUID.get("puwadech");
        assertEquals("XYZpuwadech7",uuid);
    }
}