package org.javi.dd5;

public abstract class Tiefling extends Race {

    public Tiefling() {

        setAge(new Age(18, 120));
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Intelligence, +1);
        getAbilityAdjustments().put(Ability.Charisma, +2);

    }

}