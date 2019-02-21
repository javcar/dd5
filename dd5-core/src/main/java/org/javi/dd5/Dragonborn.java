package org.javi.dd5;

public abstract class Dragonborn extends Race {

    public Dragonborn() {

        setAge(new Age(15, 80));

        getAbilityAdjustments().put(Ability.Strength, +2);
        getAbilityAdjustments().put(Ability.Charisma, +1);
      
    }

}