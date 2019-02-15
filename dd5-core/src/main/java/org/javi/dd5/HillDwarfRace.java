package org.javi.dd5;

public class HillDwarfRace extends DwarfRace {
    
    public HillDwarfRace() {
        super();

        /* Ability adjustments granted by subrace */
        getGrantedAbilityAdjustments().put(Ability.Wisdom, +1);

        grantDwarvenToughness();

    }

    private void grantDwarvenToughness() {
        setHitPointsBonusWhenLevelUp(1);
    }


}