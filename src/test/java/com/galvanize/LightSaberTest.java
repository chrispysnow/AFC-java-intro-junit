package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    LightSaber newLightSaber;

    @BeforeEach
    public void setup() {
        //setup
        this.newLightSaber = new LightSaber(1);
    }

    @Test
    public void testSetCharge() {
        //execution
        newLightSaber.setCharge(10.0f);
        //assertion
        assertEquals(10.0f, newLightSaber.getCharge(),1);
    }
    @Test
    public void testGetCharge() {
        //assertion
        assertEquals(100.0f, newLightSaber.getCharge(), 1);
    }

    @Test
    public void testSetColor() {
        //execution
        newLightSaber.setColor("blue");
        //assertion
        assertEquals("blue", newLightSaber.getColor());
    }
    @Test
    public void testGetColor() {
        //assertion
        assertEquals("green", newLightSaber.getColor());
    }
    @Test
    public void testGetSerialNumber() {
        //assertion
        assertEquals(1 , newLightSaber.getJediSerialNumber());
    }
    @Test
    public void testUse() {
        //execution
        newLightSaber.use(100.0f);
        //assertion
        assertEquals(500 , newLightSaber.getRemainingMinutes(), 0.1);
    }
    @Test
    public void testMinutesRemaining() {
        //assertion
        assertEquals(600 , newLightSaber.getRemainingMinutes(), 0.1);
    }
    @Test
    public void testRecharge() {
        newLightSaber.use(100);
        assertEquals(500 , newLightSaber.getRemainingMinutes(), 0.1);
        newLightSaber.recharge();
        assertEquals(600 ,newLightSaber.getRemainingMinutes(), 0.1);
    }

}
