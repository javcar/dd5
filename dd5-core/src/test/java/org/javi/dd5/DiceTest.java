package org.javi.dd5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DiceTest {

    Dice d4 = new Dice(4);
    Dice d6 = new Dice(6);
    Dice d8 = new Dice(8);
    Dice d10 = new Dice(10);
    Dice d12 = new Dice(12);
    Dice d20 = new Dice(20);
    Dice d100 = new Dice(100);

    @Test
    public void roll_d4() {        
        assertTrue(d4.rollPool(1000).filter(result -> result < 1 || result > d4.getFaces()).count() == 0);
    }

    @Test
    public void roll_d6() {
        assertTrue(d6.rollPool(1000).filter(result -> result < 1 && result > d6.getFaces()).count() == 0);
    }

    @Test
    public void roll_d8() {
        assertTrue(d8.rollPool(1000).filter(result -> result < 1 && result > d8.getFaces()).count() == 0);
    }

    @Test
    public void roll_d10() {
        assertTrue(d10.rollPool(1000).filter(result -> result < 1 && result > d10.getFaces()).count() == 0);
    }

    @Test
    public void roll_d12() {
        assertTrue(d12.rollPool(1000).filter(result -> result < 1 && result > d12.getFaces()).count() == 0);
    }

    @Test
    public void roll_d20() {
        assertTrue(d20.rollPool(1000).filter(result -> result < 1 && result > d20.getFaces()).count() == 0);
    }

    @Test
    public void roll_d100() {
        assertTrue(d100.rollPool(1000).filter(result -> result < 1 && result > d100.getFaces()).count() == 0);
    }

    @Test
    public void roll_3d6() {
        assertTrue(d6.rollGetSum(3) <= 6 * 3);
    }

    @Test
    public void roll_d20_with_adventage() {
        assertTrue(d20.rollTwiceGetHighest() <= 20);
    }

    @Test
    public void roll_d20_with_disadventage() {
        assertTrue(d20.rollTwiceGetLowest() <= 20);
    }
    
}