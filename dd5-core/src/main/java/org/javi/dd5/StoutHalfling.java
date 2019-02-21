package org.javi.dd5;

public abstract class StoutHalfling extends Halfling {

    public StoutHalfling() {
        
        super();

        getAbilityAdjustments().put(Ability.Constitution, +1);

        getThreatSavingThrowProficiencies().add(Threat.Poison);
    }

}