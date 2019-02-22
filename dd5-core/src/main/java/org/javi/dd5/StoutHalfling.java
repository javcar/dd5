package org.javi.dd5;

public abstract class StoutHalfling extends Halfling {

    public StoutHalfling() {
        
        super();

        getAbilityAdjustments().put(Ability.Constitution, +1);

        grantResilience();
        
    }

    // Helper methods

    private void grantResilience() {
        getThreatSavingThrowProficiencies().add(Threat.Poison);
        getThreatImmunities().add(Threat.Poison);
    }

}