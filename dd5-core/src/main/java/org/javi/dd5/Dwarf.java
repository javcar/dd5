package org.javi.dd5;

public abstract class Dwarf extends Race {

    public Dwarf() {

        setAge(new Age(50, 280));
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Constitution, +2);        

        getSkillFocusProficiencies().add(new SkillFocus(Skill.History, Focus.Stone));
        getThreatSavingThrowProficiencies().add(Threat.Poison);

    }

}