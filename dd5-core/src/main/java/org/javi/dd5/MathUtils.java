package org.javi.dd5;

public class MathUtils {

    static int roundDown(double doubleToRoundDown) { /* just round down */
        return (int) doubleToRoundDown;
    }

    static int halve(int intToHalve) { /* half & round down */
        return roundDown(intToHalve / 2);
    }
    
}