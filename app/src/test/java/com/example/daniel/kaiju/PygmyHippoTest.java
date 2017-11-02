package com.example.daniel.kaiju;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Daniel on 01/11/2017.
 */

public class PygmyHippoTest {
    PygmyHippo pygmyHippo;

    @Before
    public void before() {
        pygmyHippo = new PygmyHippo("Harold", 100.00, 50.00, "Moof");
    }

    @Test
    public void hasName() {
        assertEquals("Harold", pygmyHippo.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100.00, pygmyHippo.getHealthValue(), 0.01);
    }

    @Test
    public void hasAttackValue() {
        assertEquals(50.00, pygmyHippo.getAttackValue(), 0.01);
    }

    @Test
    public void hasRoar() {
        assertEquals("Moof", pygmyHippo.getRoar());
    }

    @Test
    public void hasAttacked() {

    }
}
