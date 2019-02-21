package org.javi.dd5;

public abstract class MountainDwarf extends Dwarf {

    public MountainDwarf() {
        
        super();

        getAbilityAdjustments().put(Ability.Strength, +2);
    }

}