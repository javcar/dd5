package org.javi.dd5;

import java.util.ArrayList;
import java.util.List;

public abstract class Profession {

    private int hitDice;    

    private List<Skill> grantedProficientSkills = new ArrayList<Skill>();
    private List<Ability> grantedProficientSavingThrows = new ArrayList<Ability>();


    public final int getHitDice() {
        return this.hitDice;
    }

    public final void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }
    
    public int getHitDiceBonus() {
        return 0;
    }

    public final List<Skill> getGrantedProficientSkills() {
        return this.grantedProficientSkills;
    }

    public final List<Ability> getGrantedProficientSavingThrows() {
        return this.grantedProficientSavingThrows;
    }
    
}