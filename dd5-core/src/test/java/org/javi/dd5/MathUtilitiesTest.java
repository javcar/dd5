package org.javi.dd5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MathUtilitiesTest {

    @Test
    public void halve() {        
        assertTrue(MathUtils.halve(5) == 2);
        assertTrue(MathUtils.halve(9) == 4);
        assertTrue(MathUtils.halve(6) == 3);
    }
    
}