package org.javi.dd5;

public abstract class HalfElf extends Race {

    public HalfElf() {

        setAge(new Age(20, 180));                
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Charisma, +2);

        produceUserSkillSlots(2);
        getThreatSavingThrowProficiencies().add(Threat.Charm);
        
    }

}