package org.javi.dd5;

public abstract class Halfling extends Race {

    public Halfling() {

        setAge(new Age(20, 150));
        setSize(Size.Small);
        setSpeed(25);        

        getAbilityAdjustments().put(Ability.Dexterity, +2);
                
        getThreatSavingThrowProficiencies().add(Threat.Fear);
    }

}