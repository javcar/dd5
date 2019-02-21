package org.javi.dd5;

public abstract class HillDwarf extends Dwarf {

    public HillDwarf() {
        
        super();

        getAbilityAdjustments().put(Ability.Wisdom, +1);
    }

}