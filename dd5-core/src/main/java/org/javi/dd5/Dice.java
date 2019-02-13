package org.javi.dd5;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dice {

    private int faces = 6;    
    private Random rand = new Random();
    private List<Integer> lastRollPool;

    static long roll(String dicePool) {
        String[] tokens = dicePool.split("d");
        Dice dice = new Dice(Integer.parseInt(tokens[1]));
        return dice.rollGetSum(Integer.parseInt(tokens[0]));
    }

    public Dice(int diceFaces) {
        this.faces = diceFaces;
    }

    public int roll() {        
        return rollPool(1).findFirst().getAsInt();
    }

    public long rollGetSum(int times) {
        IntStream rollPool = rollPool(times);
        long sum = rollPool.summaryStatistics().getSum();
        return sum;
    }

    public int rollTwiceGetHighest() {
        return rollPool(2).summaryStatistics().getMax();
    }

    public int rollTwiceGetLowest() {        
        return rollPool(2).summaryStatistics().getMin();
    }

    /* Getters & Setters */

    public int getFaces() {
        return this.faces;
    }

    public List<Integer> getLastRollPool() {
        return this.lastRollPool;
    }

    /* Helper methods */

    public IntStream rollPool(int poolSize) {        
        this.lastRollPool = rand.ints(poolSize, 1, this.faces + 1).boxed().collect(Collectors.toList());
        return this.lastRollPool.stream().mapToInt(Integer::intValue);
    }

    public String toStringLastRollPool() {        
        return this.lastRollPool.toString();
    }

}