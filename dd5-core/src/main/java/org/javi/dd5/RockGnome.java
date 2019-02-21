package org.javi.dd5;

public abstract class RockGnome extends Gnome {

    public RockGnome() {
        
        super();

        getAbilityAdjustments().put(Ability.Constitution, +1);
    }

}