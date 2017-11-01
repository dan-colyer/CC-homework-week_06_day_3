package com.example.daniel.kaiju;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Daniel on 01/11/2017.
 */

public class SegwayTest {

    Segway segway;

    @Before
    public void before() {
        segway = new Segway("Shredder", 100.00);
    }

    @Test
    public void getType() {
        assertEquals("Shredder", segway.getType());
    }

}
