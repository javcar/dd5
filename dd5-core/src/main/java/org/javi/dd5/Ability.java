package org.javi.dd5;

public class Ability {

    private int score;

    public int getScore() {
        return this.score;
    }

    public void setScores(int score) {
        this.score = score;
    }

    public int getModifier() {
        return this.score / 2;
    }
    
}