package org.javi.dd5;

public abstract class Elf extends Race {

    public Elf() {

        setAge(new Age(100, 750));
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Dexterity, +2);

        getSkillProficiencies().add(Skill.Perception);
        getThreatSavingThrowProficiencies().add(Threat.Charm);        
    }

}