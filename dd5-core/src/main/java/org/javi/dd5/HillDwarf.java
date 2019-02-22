package org.javi.dd5;

public abstract class HillDwarf extends Dwarf {

    public HillDwarf() {
        
        super();

        getAbilityAdjustments().put(Ability.Wisdom, +1);

        grantToughness();
    }

    // Helper methods

    private void grantToughness() {
        setHitPointBonusPerLevel(1);
    }

}