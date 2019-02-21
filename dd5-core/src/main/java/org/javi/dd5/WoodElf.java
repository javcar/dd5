package org.javi.dd5;

public abstract class WoodElf extends Elf {

    public WoodElf() {
        
        super();

        getAbilityAdjustments().put(Ability.Wisdom, +1);
    }

}