package org.javi.dd5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("D&D5");
        
        Dice d6 = new Dice(6);
        System.out.println("3d6 = " + d6.rollGetSum(3));
        System.out.println(d6.toStringLastRollPool());

        System.out.println("2d10 = " + Dice.roll("2d10"));
    }
}
